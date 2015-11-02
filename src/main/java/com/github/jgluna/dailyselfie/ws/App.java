package com.github.jgluna.dailyselfie.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.MultipartConfigElement;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableWebMvc
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

    @Bean
    public MultipartConfigElement getMultipartConfigElement() {
        MultipartConfigFactory f = new MultipartConfigFactory();
        //f.setMaxFileSize(1);
        f.setMaxRequestSize(50000);
        return f.createMultipartConfig();
    }
}
