package com.hunan.normal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.hunan.normal.mapper"})
public class WeNeedYouWebapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeNeedYouWebapiApplication.class, args);
    }

}
