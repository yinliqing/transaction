package com.ylq.transaction.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ylq.transaction.pojo.User;
import com.ylq.transaction.service.IUserService;

@Controller
public class UserController {

	@Autowired
    private IUserService userService;

	@RequestMapping("getUsers")
    @ResponseBody
    public Object findUsers() {
        List<User> list = userService.getUsers();
        return list;
    }
    
	@RequestMapping(value = "userlist", method = RequestMethod.GET)
	public String userlist(ModelMap model) {

		List<User> userList = new ArrayList<User>();
		userList = userService.getUsers(); // TODO: MyBatis数据库访问
		// 日志记录用户注册信息
        Logger.getLogger(UserController.class).log(Level.INFO, "userlist " + userList);
        
		model.addAttribute("command", new User());
		
		model.addAttribute("userList", userList);
		// return new ModelAndView("user", "command", new User());
		return "userlist";
	}

}
