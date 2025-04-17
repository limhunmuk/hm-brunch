package blog.hmbrunch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HmBrunchApplication {

    public static void main(String[] args) {
        SpringApplication.run(HmBrunchApplication.class, args);
    }

}
