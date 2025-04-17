package blog.hmbrunch.domain.post;

import blog.hmbrunch.domain.post.dto.PostDetailDto;
import blog.hmbrunch.domain.post.dto.PostSearchDto;
import blog.hmbrunch.domain.post.entity.QPost;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.data.domain.Page;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

import static blog.hmbrunch.domain.member.entity.QMember.member;
import static blog.hmbrunch.domain.post.entity.QPost.*;


@Repository
public class PostRepositoryImpl implements PostRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public PostRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }


    @Override
    public Page<PostDetailDto> searchPostList(PostSearchDto condition) {
        List<PostDetailDto> list = queryFactory
                .select(Projections.fields(
                        PostDetailDto.class,
                        post.id,
                        post.title,
                        post.content,
                        post.regDt,
                        post.regId,
                        member.id,
                        member.nickName
                ))
                .from(post)
                .leftJoin(member)
                .on(post.regId.eq(member.id.stringValue()))
                .where(
                    post.delYn.eq("N")
                )
                .fetch();

        Long totCount = queryFactory
                    .select(
                        post.count()
                    )
                    .from(post)
                    .where(
                        post.delYn.eq("N")
                    )
                    .fetchOne();

        return PageableExecutionUtils.getPage(list, condition.toPageable(), () -> totCount);
    }

    @Override
    public PostDetailDto searchPostDetail(PostSearchDto condition) {
        return queryFactory
                .select(Projections.fields(
                        PostDetailDto.class,
                        post.id,
                        post.title,
                        post.content,
                        post.regDt,
                        post.regId,
                        member.id,
                        member.nickName
                ))
                .from(post)
                .leftJoin(member)
                .on(post.regId.eq(member.id.stringValue()))
                .where(
                        post.id.eq(condition.getId()),
                        post.delYn.eq("N")
                )
                .fetchOne();
    }
}
