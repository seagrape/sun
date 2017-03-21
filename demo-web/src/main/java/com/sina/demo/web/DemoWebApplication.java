package com.sina.demo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(scanBasePackages = {
        "com.sina.demo"
}, exclude = {
        DataSourceAutoConfiguration.class
})
public class DemoWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class, args);
    }
}
