package com.xljt.freight;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.xljt.freight.mapper")
@ComponentScan("com.xljt.freight")
public class FreightApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreightApplication.class, args);
    }

}
