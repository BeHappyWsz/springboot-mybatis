package com.mybatis.controller;

import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author wsz
 * @Des:
 * @Date: 20:09 2017/10/16
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/findOne/{id}", method = RequestMethod.GET)
    public String findOne(Model model, @PathVariable("id") Long id){
        System.out.println(id+"d123");
        model.addAttribute("user",userService.findById(id));
        return "detail";
    }
}
