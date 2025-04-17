package blog.hmbrunch.domain.notice.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NoticeDetailDto {

    private Long id;
    private String loginId;
    private String name;
    private Integer age;

    private LocalDateTime regDt;
}
