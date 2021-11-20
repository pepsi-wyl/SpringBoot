package com.wyl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author by wyl
 * @date 2021/11/13.20点05分
 */

@Component(value = "car")   //想要读取配置信息 该类首先需要spring托管
@PropertySource(value = "classPath:./car.properties")

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class Car {

    @Value("${car.brand}")
    private String brand;

    @Value("${car.price}")
    private int price;
}

/*
 *  car.properties
 *
 *  car.brand=byd
 *  car.price=10000
 */
