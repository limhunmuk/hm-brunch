package blog.hmbrunch.domain.member.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemberDetailDto {

    private Long id;
    private String loginId;
    private String name;
    private Integer age;

    private LocalDateTime regDt;
}
