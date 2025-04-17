package blog.hmbrunch.notice;

import blog.hmbrunch.domain.notice.dto.NoticeSearchDto;
import blog.hmbrunch.web.api.controller.NoticeController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class NoticeControllerTest {

    @Autowired
    private NoticeController noticeController;

     @Test
     @DisplayName("공지사항 목록 조회")
     public void noticeList() {
        NoticeSearchDto condition = new NoticeSearchDto();
        condition.setPage(0);
        condition.setSize(10);
        condition.setSort("id");

        ResponseEntity<?> response = noticeController.getNotice(condition);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
     }

    @Test
    @DisplayName("공지사항 상세 조회")
    public void noticeListApi() {
        NoticeSearchDto condition = new NoticeSearchDto();
        String id = "1";

        ResponseEntity<?> response = noticeController.getNoticeDetail(id, condition);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
    }
}
