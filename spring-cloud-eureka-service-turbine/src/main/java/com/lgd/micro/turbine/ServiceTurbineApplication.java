package com.lgd.micro.turbine;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * <p>Project: microserver-spring-cloud</p>
 * <p>Package: com.lgd.micro.turbine</p>
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author guodong.li
 * @version 1.0.0
 * @date 2018/1/30 21:08 星期二
 */
@SpringBootApplication
@EnableTurbine
public class ServiceTurbineApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(ServiceTurbineApplication.class).web(true).run(args);
    }
}
