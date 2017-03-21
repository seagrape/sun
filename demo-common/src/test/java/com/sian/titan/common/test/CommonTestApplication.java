package com.sian.titan.common.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;


@SpringBootApplication(scanBasePackages = {
        "com.sina.demo"
}, exclude = {
        DataSourceAutoConfiguration.class,
        SessionAutoConfiguration.class
})
public class CommonTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonTestApplication.class, args);
    }
}
