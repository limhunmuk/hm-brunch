package blog.hmbrunch.domain.member.entity;

import blog.hmbrunch.domain.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.time.Instant;
import java.time.LocalDate;

import static blog.hmbrunch.web.util.IPUtils.getClientIP;

@Entity
@Getter
@Setter
@Table(name = "member")
@NoArgsConstructor
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", nullable = false)
    private Long id;

    @Column(name = "login_id", length = 50)
    private String loginId;

    @Column(name = "password", length = 255)
    private String password;

    @Column(name = "mem_nm", length = 50)
    private String name;

    @Column(name = "nick_nm", length = 50)
    private String nickName;

    @Column(name = "mem_type", length = 5)
    @Comment("회원구분")
    private String memberType;

    @Column(name = "join_dt")
    private LocalDate joinDateTime;

    @Column(name = "phone_no", length = 20)
    private String phoneNumber;

    @Column(name = "addr", length = 50)
    private String address;

    @Column(name = "addr_detail", length = 100)
    private String addressDetail;

    public Member(String loginId, String password, String name, String nickName, String memberType,
                  LocalDate joinDateTime, String phoneNumber, String address, String addressDetail, String regId, String regIp) {

        this.loginId = loginId;
        this.password = password;
        this.name = name;
        this.nickName = nickName;
        this.memberType = memberType;
        this.joinDateTime = joinDateTime;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.addressDetail = addressDetail;
        this.regId = regId;
        this.regIp = regIp;
    }

    /**
    public Member create() {
        return new Member(this.loginId, this.password, this.name, this.nickName,
                this.memberType, this.joinDateTime, this.phoneNumber, this.address, this.addressDetail);

    }
     */

}
