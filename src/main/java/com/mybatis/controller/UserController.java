package com.mybatis.controller;

import com.mybatis.domain.User;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author wsz
 * @Des:
 * @Date: 20:09 2017/10/16
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    private User user;
    private Long aLong;

    @RequestMapping(value = "/user/findOne/{id}", method = RequestMethod.GET)
    public String findOne(Model model, @PathVariable("id") Long id){
        model.addAttribute("user",userService.findById(id));
        return "detail";
    }

    @RequestMapping(value = "/user/searchByName/{name}")
    public String searchByName(Model model, @PathVariable("name") String name){
        List<User> list;
        if (null == name || "".equals(name) || "-1".equals(name)){
            list = userService.findAll();
        }else{
            list = userService.searchByName(name);
        }
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping(value = "/user/findAll",method = RequestMethod.GET)
    public String findAll(Model model){
        List<User> list = userService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping(value = "/insertUserForm")
    public String insertUserForm(Model model){
        return "add";
    }

    @RequestMapping(value = "/insert")
    public String saveUser(@ModelAttribute User user){
        Long i = userService.insertUser(user);
        return "redirect:/user/findAll";
    }


    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") Long id){
        Long i = userService.deleteUser(id);
        if(i>0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        return "redirect:/user/findAll";
    }

    @RequestMapping(value = "/updateUserForm/{id}")
    public String updateUserForm(Model model,@PathVariable("id") Long id){
        user = userService.findById(id);
        model.addAttribute("user",user);
        return "update";
    }

    @RequestMapping("/update")
    public String updateUser(@ModelAttribute User user){
        aLong = userService.updateUser(user);
        if (aLong > 0){
            System.out.println("已更新");
        }else{
            System.out.println("更新失败");
        }
        return "redirect:/user/findAll";
    }
}
