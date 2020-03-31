package com.ldj.preventsubmit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class PreventSubmitApplication {

    public static void main(String[] args) {
        SpringApplication.run(PreventSubmitApplication.class, args);
    }

}
