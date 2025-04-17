package blog.hmbrunch.comon;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.SecureRandom;
import java.util.Base64;

public class AESUtilTest {

    @Test
    @DisplayName("AES 암호화 테스트")
    public void test() throws Exception {
        // AES 256비트 키 생성
        SecretKey secretKey = generateAESKey();
        String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());

        System.out.println("생성된 AES 키: " + encodedKey);
    }


    public static SecretKey generateAESKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256, new SecureRandom()); // 난수 기반 키 생성
        return keyGenerator.generateKey();
    }

}
