package com.pepsiwyl;


import com.pepsiwyl.service.RedisService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
//        run.getBean("DataSource_T", DataSource_T.class).showConnectionInfo();
//        System.out.println(run.getBean("userJdbcTemplate", UserJDBCTemplate.class).getUserList());
//        run.getBean("userMapper", UserMapper.class).getUserList().forEach((v) -> System.out.println(v));

//        RedisService redisService = run.getBean("redisService", RedisService.class);
//        redisService.setValue("hello","world");
//        System.out.println(redisService.getValue("hello"));
    }

}
