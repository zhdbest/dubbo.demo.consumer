package com;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author haodong.zhao
 * @version 1.0. Added Time:2019/4/5 11:25
 */
@SpringBootApplication
@ServletComponentScan("com.*")
@EnableDubbo(scanBasePackages = "com.*")
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
