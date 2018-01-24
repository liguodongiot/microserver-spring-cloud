package com.lgd.micro.feign.client;

import org.springframework.stereotype.Component;

/**
 * <p>Project: spring-cloud</p>
 * <p>Package: com.lgd.micro.feign.client</p>
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author guodong.li
 * @version 1.0.0
 * @date 2018/1/24 18:10 星期三
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
