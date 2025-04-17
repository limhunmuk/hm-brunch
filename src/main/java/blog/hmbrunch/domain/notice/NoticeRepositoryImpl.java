package blog.hmbrunch.domain.notice;

import blog.hmbrunch.domain.member.dto.MemberDetailDto;
import blog.hmbrunch.domain.member.dto.MemberSearchDto;
import blog.hmbrunch.domain.member.entity.QMember;
import blog.hmbrunch.domain.notice.dto.NoticeDetailDto;
import blog.hmbrunch.domain.notice.dto.NoticeSearchDto;
import blog.hmbrunch.domain.notice.entity.QNotice;
import blog.hmbrunch.domain.post.entity.QPost;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.data.domain.Page;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

import static blog.hmbrunch.domain.member.entity.QMember.*;
import static blog.hmbrunch.domain.member.entity.QMember.member;
import static blog.hmbrunch.domain.notice.entity.QNotice.notice;
import static blog.hmbrunch.domain.post.entity.QPost.post;


@Repository
public class NoticeRepositoryImpl implements NoticeRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public NoticeRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }


    @Override
    public Page<NoticeDetailDto> searchNoticeList(NoticeSearchDto condition) {
        List<NoticeDetailDto> list = queryFactory
                .select(Projections.fields(
                        NoticeDetailDto.class,
                        notice.id,
                        notice.title,
                        notice.content,
                        notice.regDt,
                        notice.regId,
                        member.id,
                        member.nickName
                ))
                .from(notice)
                .leftJoin(member)
                .on(notice.regId.eq(member.id.stringValue()))
                .where(
                    notice.delYn.eq("N")
                )
                .fetch();

        Long totCount = queryFactory
                    .select(
                        notice.count()
                    )
                    .from(notice)
                    .where(
                        notice.delYn.eq("N")
                    )
                    .fetchOne();

        return PageableExecutionUtils.getPage(list, condition.toPageable(), () -> totCount);
    }

    @Override
    public NoticeDetailDto searchNoticeDetail(NoticeSearchDto condition) {
        return queryFactory
                .select(Projections.fields(
                        NoticeDetailDto.class,
                        notice.id,
                        notice.title,
                        notice.content,
                        notice.regDt,
                        notice.regId,
                        member.id,
                        member.nickName
                ))
                .from(notice)
                .leftJoin(member)
                .on(notice.regId.eq(member.id.stringValue()))
                .where(
                        notice.id.eq(condition.getId()),
                        notice.delYn.eq("N")
                )
                .fetchOne();
    }
}
