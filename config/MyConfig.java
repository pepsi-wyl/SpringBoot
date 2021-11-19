package com.wyl.config;

import ch.qos.logback.core.db.DBHelper;
import com.wyl.pojo.Person;
import com.wyl.pojo.Pet;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author by wyl
 * @date 2021/11/13.15点59分
 */

/**
 * @Configuration 标志此类为配置类==配置文件   本身也为组件
 * value   组件ID
 * proxyBeanMethods
 * true  默认   Full  保证每个@Bean方法被调用多少次都是单例的
 * proxyBeanMethods = true   myConfig.person()==(person):true  SpringBoot总会检查组件是否在容器中存在是否，保持只有单例
 * false      Lite 每个@Bean方法被调用多少次都是新创建的
 * 组件依赖必须用Full
 
 * @Bean 给容器中添加组件  方法名称为组件ID  返回类型为组件类型   返回的对象为容器中的实例
 * @EnableConfigurationProperties       开启xxx类配置绑定功能 (xxx组件没有注册才配置)
 * @ImportResource       引入XML配置文件
 * @Import({DBHelper.class}) 给容器中自动创建出这个类型的组件，名称为全类名   System.out.println(run.getBeansOfType(DBHelper.class));
 * @Conditional 可以加在类上 也可以加在方法上   条件装配
 
 */

//@ConditionalOnBean(name = "tom")
//@ConditionalOnMissingBean(name = "tom")

//@EnableConfigurationProperties(xxx.class)                     //开启xxx类配置绑定功能 (xxx组件没有注册才配置)

@Import({DBHelper.class})                                       //给容器中自动创建出这个类型的组件，名称为全类名
@ImportResource("classpath:applicationContext.xml")             //引入XML配置文件

@Configuration(value = "myConfig", proxyBeanMethods = true)     //告诉SpringBoot此类为配置类==配置文件
public class MyConfig {

    @ConditionalOnMissingBean(name = "pet")    //容器中没有tom的时候才装配   Conditional
    @Bean      //给容器中添加组件  方法名称为组件ID   返回类型为组件类型   返回的对象为容器中的实例
    public Pet pet() {
        return new Pet("Tomcat");
    }

    @ConditionalOnBean(name = "pet")           //容器中有tom的时候才装配    Conditional
    @Bean      //给容器中添加组件  方法名称为组件ID  返回类型为组件类型   返回的对象为容器中的实例
    public Person person() {
        return new Person(1, "zhazha", 20, pet());
    }

}
