package blog.hmbrunch.domain.notice;

import blog.hmbrunch.domain.member.dto.MemberDetailDto;
import blog.hmbrunch.domain.member.dto.MemberSearchDto;
import blog.hmbrunch.domain.notice.dto.NoticeDetailDto;
import blog.hmbrunch.domain.notice.dto.NoticeSearchDto;
import org.springframework.data.domain.Page;

public interface NoticeRepositoryCustom {

    Page<NoticeDetailDto> searchNoticeList(NoticeSearchDto condition);

    NoticeDetailDto searchNoticeDetail(NoticeSearchDto condition);
}
