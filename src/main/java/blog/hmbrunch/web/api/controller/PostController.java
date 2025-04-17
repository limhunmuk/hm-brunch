package blog.hmbrunch.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hunmuk
 */
@RestController
public class PostController {

    @GetMapping("/api/post")
    public String getPost() {
        return "Hello, Post!";
    }
}
