package com.ijse.spring.config;

import com.ijse.spring.WebAppInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = WebAppInitializer.class)
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("Web App Initialize Success !");
    }
}
