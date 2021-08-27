package com.ylq.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ylq.transaction.pojo.User;
import com.ylq.transaction.service.IUserService;

@Controller
public class ItemsController {
	
    @Autowired
	private IUserService userService;
    
    @RequestMapping("/users")
    public ModelAndView users() throws Exception {
    	//
        List<User> userList = userService.getUsers();
        //
        ModelAndView modelAndView = new ModelAndView();
        //
        modelAndView.addObject("userList", userList);
        //
        modelAndView.setViewName("userlist");
        return modelAndView;
	}
}
