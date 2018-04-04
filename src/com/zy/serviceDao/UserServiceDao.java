package com.zy.serviceDao;

import java.util.List;

import com.zy.vo.Role;
import com.zy.vo.User;
import com.zy.vo.User_Role;

public interface UserServiceDao {

	public Boolean panduan(String username,String password);
	public void addUser(User user);
	public List<String> selectPrivilege(String username);
	public List<User_Role> selectAllUser(int start);
	public int selectUser_Role(String username);
	public List<Role> findAllRole();
	public int countPages();
	public void delUser(Integer UId);
	public User findByUId(Integer UId);
	public Role findByRId(Integer RId);//查询单个角色	
	public void updateUser(User user);
	public User_Role selectOneUser(Integer UId);
}
