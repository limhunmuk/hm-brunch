package blog.hmbrunch.domain.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@SuperBuilder
@Getter
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SimpleBaseEntity {

    @CreatedBy
    @Column(nullable = false, updatable = false)
    protected String regId;

    @Column(updatable = false)
    protected String regIp;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    protected LocalDateTime regDt;

    private String delYn;

}
