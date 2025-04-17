package blog.hmbrunch.domain.post.entity;

import blog.hmbrunch.domain.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "article", schema = "hm-branch")
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id", nullable = false)
    private Long id;

    @Column(name = "group_cd", length = 5)
    private String groupCd;

    @Column(name = "detail_cd", length = 5)
    private String detailCd;

    @Column(name = "title", nullable = false)
    private String title;

    @Lob
    @Column(name = "content")
    private String content;

    @Column(name = "status_cd", length = 5)
    private String statusCd;

    @Column(name = "upload_file_id")
    private Long uploadFileId;


}