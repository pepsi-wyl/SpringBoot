package com.wyl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author by wyl
 * @date 2021/11/14.19点44分
 */

@Component(value = "person")                      //注册组件
//@EnableConfigurationProperties(Person.class)    //开启Person配置绑定功能 组件没有注册时在config类中进行配置

@ConfigurationProperties(prefix = "person")       //读取配置文件中的数据 前缀为person

@Data
@AllArgsConstructor
@NoArgsConstructor
@EnableConfigurationProperties
public class Person {
    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String, Object> score;
    private Set<Double> salarys;
    private Map<String, List<Pet>> allPets;
}
