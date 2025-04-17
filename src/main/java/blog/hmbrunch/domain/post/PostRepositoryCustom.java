package blog.hmbrunch.domain.post;

import blog.hmbrunch.domain.post.dto.PostDetailDto;
import blog.hmbrunch.domain.post.dto.PostSearchDto;
import org.springframework.data.domain.Page;

public interface PostRepositoryCustom {

    Page<PostDetailDto> searchPostList(PostSearchDto condition);

    PostDetailDto searchPostDetail(PostSearchDto condition);
}
