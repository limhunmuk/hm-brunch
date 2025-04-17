package blog.hmbrunch.domain.postcomment;

import blog.hmbrunch.domain.postcomment.dto.PostCommentDetailDto;
import blog.hmbrunch.domain.postcomment.dto.PostCommentSearchDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.data.domain.Page;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

import static blog.hmbrunch.domain.member.entity.QMember.member;
import static blog.hmbrunch.domain.postcomment.entity.QArticleComment.*;


@Repository
public class PostCommentRepositoryImpl implements PostCommentRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public PostCommentRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }


    @Override
    public Page<PostCommentDetailDto> searchPostCommentList(PostCommentSearchDto condition) {
        List<PostCommentDetailDto> list = queryFactory
                .select(Projections.fields(
                        PostCommentDetailDto.class,
                        articleComment.id,
                        articleComment.title,
                        articleComment.content,
                        articleComment.regDt,
                        articleComment.regId,
                        member.id,
                        member.nickName
                ))
                .from(articleComment)
                .leftJoin(member)
                .on(articleComment.regId.eq(member.id.stringValue()))
                .where(
                    articleComment.delYn.eq("N")
                )
                .fetch();

        Long totCount = queryFactory
                    .select(
                        articleComment.count()
                    )
                    .from(articleComment)
                    .where(
                        articleComment.delYn.eq("N")
                    )
                    .fetchOne();

        return PageableExecutionUtils.getPage(list, condition.toPageable(), () -> totCount);
    }

    @Override
    public PostCommentDetailDto searchPostCommentDetail(PostCommentSearchDto condition) {
        return queryFactory
                .select(Projections.fields(
                        PostCommentDetailDto.class,
                        articleComment.id,
                        articleComment.title,
                        articleComment.content,
                        articleComment.regDt,
                        articleComment.regId,
                        member.id,
                        member.nickName
                ))
                .from(articleComment)
                .leftJoin(member)
                .on(articleComment.regId.eq(member.id.stringValue()))
                .where(
                        articleComment.id.eq(condition.getId()),
                        articleComment.delYn.eq("N")
                )
                .fetchOne();
    }
}
