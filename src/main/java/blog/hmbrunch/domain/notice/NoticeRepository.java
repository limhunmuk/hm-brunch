package blog.hmbrunch.domain.notice;

import blog.hmbrunch.domain.member.entity.Member;
import blog.hmbrunch.domain.notice.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface NoticeRepository extends JpaRepository<Notice, Long>,
                                            QuerydslPredicateExecutor<Notice>, NoticeRepositoryCustom {

}
