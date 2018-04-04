package com.zy.userDao;

import java.util.List;

import com.zy.vo.Role;
import com.zy.vo.User;
import com.zy.vo.User_Role;

public interface UserDao {

	public Boolean panduan(String username,String password);
	public void addUser(User user);
	public List<String> selectPrivilege(String username);//用户权限
	public List<User_Role> selectAllUser(int start);
	public int selectUser_Role(String username);//单个用户角色RId
	public List<Role> findAllRole();
	public int countPages();//总条数
	public void delUser(Integer UId);
	public User findByUId(Integer UId);//查询单个用户,删除,修改
	public Role findByRId(Integer RId);//查询单个角色	
	public void updateUser(User user);
	public User_Role selectOneUser(Integer UId);
}
