package com.lgd.micro.config.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>Project: microserver-spring-cloud</p>
 * <p>Package: PACKAGE_NAME</p>
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author guodong.li
 * @version 1.0.0
 * @date 2018/1/25 18:57 星期四
 */
@EnableEurekaServer
@SpringBootApplication
public class ConfigEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaServerApplication.class, args);
    }
}