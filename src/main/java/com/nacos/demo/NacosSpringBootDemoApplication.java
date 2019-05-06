package com.nacos.demo;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nacos.demo.mapper")
@NacosPropertySource(dataId = "config.properties" ,autoRefreshed = true)
public class NacosSpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSpringBootDemoApplication.class, args);
    }

}
