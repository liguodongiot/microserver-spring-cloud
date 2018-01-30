package com.lgd.micro.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Project: microserver-spring-cloud</p>
 * <p>Package: com.lgd.micro.consul</p>
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author guodong.li
 * @version 1.0.0
 * @date 2018/1/29 15:59 星期一
 */

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConsulApplication {

    @RequestMapping("/hi")
    public String home() {
        return "hi ,i'm miya";
    }

    public static void main(String[] args) {
        //SpringApplication.run(ConsulApplication.class, args);
        new SpringApplicationBuilder(ConsulApplication.class).web(true).run(args);
    }
}