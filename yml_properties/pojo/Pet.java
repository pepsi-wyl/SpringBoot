package com.wyl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author by wyl
 * @date 2021/11/14.20点58分
 */

@Component("pet")                               //注册组件
//@EnableConfigurationProperties(Pet.class)     //开启car配置绑定功能  组件没有注册时 在config类中进行配置该注解

@ConfigurationProperties(prefix = "pet")        //读取配置文件中的数据 前缀为pet

@Data
@AllArgsConstructor
@NoArgsConstructor
@EnableConfigurationProperties

public class Pet {
    private String name;
}
