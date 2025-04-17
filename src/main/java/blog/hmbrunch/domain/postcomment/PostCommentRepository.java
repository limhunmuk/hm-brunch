package blog.hmbrunch.domain.postcomment;

import blog.hmbrunch.domain.post.entity.Post;
import blog.hmbrunch.domain.postcomment.entity.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface PostCommentRepository extends JpaRepository<PostComment, Long>,
                                            QuerydslPredicateExecutor<PostComment>, PostCommentRepositoryCustom {

}
