
package blog.hmbrunch.notice;

import blog.hmbrunch.domain.notice.dto.NoticeSearchDto;
import blog.hmbrunch.web.api.controller.NoticeController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
//@WebMvcTest(NoticeController.class)
public class NoticeControllerRestDocsTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("공지사항 목록 조회")
    public void noticeList() throws Exception {

        mockMvc.perform(
                    get("/api/notice")
                            .param("page", "0")
                            .param("size", "10")
                            .param("sort", "id,desc")
                )
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();
    }

    @Test
    @DisplayName("공지사항 상세 조회")
    public void noticeDetail() throws Exception {

        mockMvc.perform(
                    get("/api/notice/{id}", 1)
                )
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();
    }


}
