package blog.hmbrunch.domain.postcomment.dto;

import lombok.Data;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Data
public class PostCommentSearchDto {

    private Long id;
    private String loginId;
    private Integer name;

    private int page = 0;
    private int size = 10;
    private String sort = "id";

    public Pageable toPageable() {
        return PageRequest.of(page, size, Sort.by(sort));
    }
}
