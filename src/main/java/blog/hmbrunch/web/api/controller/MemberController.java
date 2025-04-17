package blog.hmbrunch.web.api.controller;


import blog.hmbrunch.web.api.dto.LoginDetailDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author hunmuk
 */
@Controller
public class MemberController {

    @PostMapping("/api/login")
    public ResponseEntity<LoginDetailDto> loginPage(@RequestBody LoginDetailDto request) {

        System.out.println("request.getLoginId() = " + request.getLoginId());
        System.out.println("request.getPassword() = " + request.getPassword());

        return ResponseEntity.ok(request);
    }

}
