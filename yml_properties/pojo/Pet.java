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

@ConfigurationProperties(prefix = "pet")
@Component("pet")                               //注册组件

@Data
@AllArgsConstructor
@NoArgsConstructor
@EnableConfigurationProperties

public class Pet {
    private String name;
}
