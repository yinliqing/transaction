package com.ylq.transaction.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylq.transaction.mapper.IUserMapper;
import com.ylq.transaction.pojo.User;
import com.ylq.transaction.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	// 自动注入，因为在容器中有该mapper
	@Autowired
	private IUserMapper userMapper;
    
    public List<User> getUsers() {
		return userMapper.getUsers();
	}
}
