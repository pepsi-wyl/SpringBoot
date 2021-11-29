package com.wyl;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MailApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MailApplication.class, args);
        MailService service = run.getBean("mailService", MailService.class);
        String[] filePaths = {"C:\\Users\\Lenovo\\Desktop\\test.rar", "C:\\Users\\Lenovo\\Desktop\\test.jpg", "C:\\Users\\Lenovo\\Desktop\\test.txt", "C:\\Users\\Lenovo\\Desktop\\test.css"};
        service.sendMail("2322535585@qq.com", "title", "Test", true,  filePaths);
    }

}
