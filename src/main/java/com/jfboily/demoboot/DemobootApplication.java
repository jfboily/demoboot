package com.jfboily.demoboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemobootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemobootApplication.class, args);
    }

}
