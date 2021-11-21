package com.wyl.controller;

import com.wyl.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * @author by wyl
 * @date 2021/11/20.16点09分
 */

@Controller(value = "thymeleafController")
@RequestMapping(value = "/thymeleafController")
public class ThymeleafController {

    @RequestMapping(value = "/t")
    public String t(Model model) {
        //简单数据
        model.addAttribute("msg", "<h1>Hello Thymeleaf<h1>");

        //对象
        User wyl = new User(1, "wyl", "88888888");
        model.addAttribute("wyl", wyl);

        //list
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1, "zhazha", "888888"));
        list.add(new User(2, "wyl", "888888"));
        list.add(new User(3, "wxl", "888888"));
        model.addAttribute("list", list);

        //url
        model.addAttribute("url","https://www.jianfast.com/?ext=ch");
        model.addAttribute("url2","/thymeleafController/t");
        return "Thymeleaf";
    }

}
