package pers.wangshun.supermarketserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("pers.wangshun.supermarketserver.mapper")
public class SupermarketServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermarketServerApplication.class, args);
    }

}
