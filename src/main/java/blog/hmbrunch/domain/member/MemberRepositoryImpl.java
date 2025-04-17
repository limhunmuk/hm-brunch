package blog.hmbrunch.domain.member;

import blog.hmbrunch.domain.member.dto.MemberDetailDto;
import blog.hmbrunch.domain.member.dto.MemberSearchDto;
import blog.hmbrunch.domain.member.entity.QMember;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

import static blog.hmbrunch.domain.member.entity.QMember.member;


@Repository
public class MemberRepositoryImpl implements MemberRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public MemberRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public Page<MemberDetailDto> searchMemberList(MemberSearchDto condition) {

        List<MemberDetailDto> list = queryFactory
                .select(Projections.fields(
                        MemberDetailDto.class,
                        member.id,
                        member.loginId,
                        member.name,
                        member.regDt,
                        member.regId
                ))
                .from(member)
                //.where(member.loginId.isNotEmpty())
                .fetch();

        Long totCount = queryFactory.select(
                        member.count())
                        .from(member)
                        .fetchOne();


        return PageableExecutionUtils.getPage(list, condition.toPageable(), () -> totCount);
    }

    @Override
    public MemberDetailDto searchMemberDetail(MemberSearchDto memberSearch) {

        return queryFactory
                .select(Projections.fields(
                        MemberDetailDto.class,
                        member.id,
                        member.loginId,
                        member.name,
                        member.regDt,
                        member.regId
                ))
                .from(member)
                .where(
                        member.id.eq(memberSearch.getId())
                )
                .fetchFirst();
    }


}
