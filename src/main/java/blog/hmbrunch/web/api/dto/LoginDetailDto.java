package blog.hmbrunch.web.api.dto;

import lombok.Getter;

@Getter
public class LoginDetailDto {

    String loginId;
    String password;

    public LoginDetailDto(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }
}
