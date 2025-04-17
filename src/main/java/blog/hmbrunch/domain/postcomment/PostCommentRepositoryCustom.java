package blog.hmbrunch.domain.postcomment;

import blog.hmbrunch.domain.post.dto.PostDetailDto;
import blog.hmbrunch.domain.post.dto.PostSearchDto;
import blog.hmbrunch.domain.postcomment.dto.PostCommentDetailDto;
import blog.hmbrunch.domain.postcomment.dto.PostCommentSearchDto;
import org.springframework.data.domain.Page;

public interface PostCommentRepositoryCustom {

    Page<PostCommentDetailDto> searchPostCommentList(PostCommentSearchDto condition);

    PostCommentDetailDto searchPostCommentDetail(PostCommentSearchDto condition);
}
