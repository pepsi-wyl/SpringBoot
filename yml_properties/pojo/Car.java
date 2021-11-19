
package com.wyl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author by wyl
 * @date 2021/11/13.20点05分
 */

/**
 * @ConfigurationProperties(prefix = "mycar") 引入application.properties配置文件
 * 1.@Component(value = "car")                    //想要读取配置信息 该类需要spring托管
 * 2.配置类中@EnableConfigurationProperties(Car.class)    //开启car配置绑定功能   复合注解含有@Import自动注入IOC容器
 */

@Component(value = "car")   //想要读取配置信息 该类首先需要spring托管
//@EnableConfigurationProperties(Car.class)   //若该组件为注册,则在config配置类中配置该注解

@ConfigurationProperties(prefix = "mycar")

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class Car {
    private String brand;
    private int price;
}
