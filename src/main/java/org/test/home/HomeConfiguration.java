package org.test.home;

import org.springframework.context.annotation.Bean;

public class HomeConfiguration {

    @Bean
    public HomeController homeController() {
        return new HomeController();
    }
}
