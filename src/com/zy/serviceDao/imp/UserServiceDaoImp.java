package com.zy.serviceDao.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zy.serviceDao.UserServiceDao;
import com.zy.userDao.UserDao;
import com.zy.vo.Role;
import com.zy.vo.User;
import com.zy.vo.User_Role;
@Service("userServiceDao")
public class UserServiceDaoImp implements UserServiceDao{

	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public Boolean panduan(String username, String password) {
		
		return this.userDao.panduan(username, password);
	}

	@Override
	public void addUser(User user) {
        this.userDao.addUser(user);		
	}
    
	@Override
	public Role findByRId(Integer RId) {
		
		return this.userDao.findByRId(RId);
	}

	@Override
	public List<String> selectPrivilege(String username) {
		
		return this.userDao.selectPrivilege(username);
	}

	@Override
	public List<User_Role> selectAllUser(int start) {
		
		return this.userDao.selectAllUser(start);
	}
	
	@Override
	public int selectUser_Role(String username) {
		return this.userDao.selectUser_Role(username);
	}
	@Override
	public int countPages() {
		return this.userDao.countPages();
	}
	@Override
	public void delUser(Integer UId) {
		this.userDao.delUser(UId);
	}
	@Override
	public User findByUId(Integer UId) {
		
		return this.userDao.findByUId(UId);
	}
	@Override
	public List<Role> findAllRole() {
		
		return this.userDao.findAllRole();
	}

	@Override
	public void updateUser(User user) {
		this.userDao.updateUser(user);
		
	}
	@Override
	public User_Role selectOneUser(Integer UId) {
		
		return this.userDao.selectOneUser(UId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
