package org.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.test.config.ThymeleafConfiguration;
import org.test.home.HomeConfiguration;

@SpringBootApplication
@Import({ThymeleafConfiguration.class, HomeConfiguration.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
