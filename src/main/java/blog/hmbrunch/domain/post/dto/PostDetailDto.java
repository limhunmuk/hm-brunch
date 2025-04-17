package blog.hmbrunch.domain.post.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostDetailDto {

    private Long id;
    private String loginId;
    private String name;
    private Integer age;

    private LocalDateTime regDt;
}
