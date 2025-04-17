package blog.hmbrunch.domain.post;

import blog.hmbrunch.domain.notice.entity.Notice;
import blog.hmbrunch.domain.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface PostRepository extends JpaRepository<Post, Long>,
                                            QuerydslPredicateExecutor<Post>, PostRepositoryCustom {

}
