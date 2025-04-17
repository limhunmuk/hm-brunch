package blog.hmbrunch.member;

import blog.hmbrunch.domain.member.MemberRepository;
import blog.hmbrunch.domain.member.entity.Member;
import blog.hmbrunch.web.util.IPUtils;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;

import java.time.LocalDate;

@SpringBootTest
public class MemberServiceTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @DisplayName("회원가입 테스트")
    public void createMember(){

        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setRemoteAddr("192.168.1.100"); // 테스트용 IP 주소 설정

        String clientIP = IPUtils.getClientIP(request);


        Member member = new Member(
                "ihm2119@naver.com",
                "password",
                "test_name",
                "test_nickname",
                "user",
                LocalDate.now(),
                "010-2928-4196",
                "서울시 송파구",
                "충민로 5",
                "admin",
                clientIP
        );

        Member save = memberRepository.save(member);
        System.out.println("저장된 회원: " + save.getLoginId());}
}
