package com.example.rjwm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@Slf4j
@SpringBootApplication
@ServletComponentScan// 只有这个注解才会去扫过滤器
public class RjwmApplication {

    public static void main(String[] args) {
        SpringApplication.run(RjwmApplication.class, args);
        log.info("项目启动成功...");
    }

}
