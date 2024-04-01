package com.huat.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.huat.dao.UserDao;
import org.springframework.stereotype.Component;

import com.huat.po.User;
import com.huat.service.UserService;

@Component("userServiceImpl")
public class UserServiceImpl implements UserService {
	//要调用dao层代码,所以要有UserDao的对象
	@Resource(name="userDaoImpl")
	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void delete(User user) {
		this.userDao.delete(user);
	}
	public List<User> findAllUsers() {
		return this.userDao.findAllUsers();
	}
	public User findUserById(int id) {
		
		return this.userDao.findUserById(id);
	}

	public void save(User user) {
		this.userDao.save(user);

	}

	public void update(User user) {
		this.userDao.update(user);
	}

	public User getUserByLoginNameAndPassword(String username, String password) {
		
		return this.userDao.getUserByLoginNameAndPassword(username,password);
	}

	public User findUserByName(String username) {
		
		return this.userDao.findUserByName(username);
	}

	public User queryUser(String username) {
		return this.userDao.queryUser(username);
	}

	public User findUserByinfo(String username, String name, String sex,
			String phone, String post, String address, String email) {
		
		return this.userDao.findUserByinfo(username, name,sex,phone, post, address, email);
	}


}
