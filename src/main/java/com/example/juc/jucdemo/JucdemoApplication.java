package com.example.juc.jucdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JucdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JucdemoApplication.class, args);
        System.out.println("启动成功");
    }

}
