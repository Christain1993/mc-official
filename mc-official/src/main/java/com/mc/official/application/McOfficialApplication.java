package com.mc.official.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan
public class McOfficialApplication {

    public static void main(String[] args) {
        SpringApplication.run(McOfficialApplication.class, args);
    }

}
