package com.imooc.homepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


//仅需要@EnableEurekaServer 注解就可以让应用变为Eureka server
//pom文件中对应到spring-cloud-starter-netflex-eureka-server


@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
