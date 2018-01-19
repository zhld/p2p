package com.p2p;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by ASUS on 2018/1/17.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.p2p"})
@MapperScan("com.p2p.mapper")
public class P2pApplication {
    public static void main(String[] args) {
        SpringApplication.run(P2pApplication.class,args);
    }
}
