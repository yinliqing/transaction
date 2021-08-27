package com.ylq.transaction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ylq.transaction.pojo.User;

@Controller
public class AddController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(ModelMap model) {
		model.addAttribute("command", new User());
		// return new ModelAndView("student", "command", new Employee());
		model.addAttribute("name", "");
	    model.addAttribute("age", "");
	    model.addAttribute("id", "");
		return "add";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute("/")User employee, ModelMap model) {
		model.addAttribute("command", new User());
		// return new ModelAndView("student", "command", new Student());
		model.addAttribute("name", employee.getName());
	    model.addAttribute("age", employee.getAge());
	    model.addAttribute("id", employee.getId());
		return "result";
	}

}
