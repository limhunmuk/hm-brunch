package blog.hmbrunch.domain.notice.entity;

import blog.hmbrunch.domain.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "notice", schema = "hm-branch")
public class Notice extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_id", nullable = false)
    private Long id;

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