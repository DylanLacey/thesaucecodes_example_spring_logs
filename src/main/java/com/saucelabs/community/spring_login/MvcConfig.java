package com.saucelabs.community.spring_login;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    private static final Logger logger = LoggerFactory.getLogger(MvcConfig.class);

    public void addViewControllers(ViewControllerRegistry registry) {
        logger.info("adding Controllers");
        registry.addViewController("/profile").setViewName("profile");
        registry.addViewController("/").setViewName("home");
//        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }

}
