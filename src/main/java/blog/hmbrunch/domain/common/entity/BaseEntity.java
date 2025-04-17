package blog.hmbrunch.domain.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

/**
 * @author hunmuk
 */
@MappedSuperclass
@SuperBuilder
@Getter
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BaseEntity extends SimpleBaseEntity {

    @LastModifiedBy
    @Column(insertable = false)
    protected String modId;

    //@LastModifiedBy
    @Column(insertable = false)
    protected String modIp;

    @LastModifiedDate
    @Column(insertable = false)
    protected LocalDateTime modDt;

}
