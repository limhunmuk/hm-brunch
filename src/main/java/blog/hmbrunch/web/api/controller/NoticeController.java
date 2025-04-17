package blog.hmbrunch.web.api.controller;

import blog.hmbrunch.domain.notice.NoticeRepository;
import blog.hmbrunch.domain.notice.dto.NoticeDetailDto;
import blog.hmbrunch.domain.notice.dto.NoticeSearchDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeRepository noticeRepository;

    /**
     * 공지사항 목록 조회
     *
     * @param condition
     * @return
     */
    @GetMapping("/api/notice")
    @ResponseBody
    public ResponseEntity<?> getNotice(NoticeSearchDto condition) {

        Page<NoticeDetailDto> noticeList = noticeRepository.searchNoticeList(condition);
        return ResponseEntity.ok(noticeList);
    }
    /**
     * 공지사항 상세 조회
     *
     * @param id
     * @param condition
     * @return
     */
    @GetMapping("/api/notice/{id}")
    @ResponseBody
    public ResponseEntity<?> getNoticeDetail(@PathVariable String id, NoticeSearchDto condition) {

        condition.setId(Long.valueOf(id));
        NoticeDetailDto noticeDetail = noticeRepository.searchNoticeDetail(condition);
        return ResponseEntity.ok(noticeDetail);
    }
}
