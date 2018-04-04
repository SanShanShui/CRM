package com.zy.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.zy.serviceDao.UserServiceDao;
import com.zy.util.MethodInfo;
import com.zy.vo.Role;
import com.zy.vo.User;
import com.zy.vo.User_Role;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User_Role>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Resource(name="userServiceDao")
	private UserServiceDao userServiceDao;
	private User_Role userRole=new User_Role();
	private User u=new User();
	private int page;
	private int pages;

	@MethodInfo(name="selectUser")
	public String selectAllUser(){
		if(page==0){
			page=1;
		}
		int start=0;
		int counts=this.userServiceDao.countPages();
		if(counts==0){
			pages=1;
		}else if(counts%6==0){
			pages=counts/6;
		}else{
			pages=counts/6+1;
			}
		start=(page-1)*6;
		List<User_Role> list=this.userServiceDao.selectAllUser(start);
		ActionContext.getContext().put("userlist", list);
		return "selectAllUser";
	}
	
	@MethodInfo(name="delUser")
	public String delUser(){
		this.userServiceDao.delUser(this.userRole.getUId());
		return "delUser";
	}
	@MethodInfo(name="addUser")
	public String addUser(){
		User user=new User();
		BeanUtils.copyProperties(this.u, user);
		user.setRole(this.userServiceDao.findByRId(this.userRole.getRId()));
        this.userServiceDao.addUser(user);
		return "addUser";
	}
	
	@MethodInfo(name="addUser")
	public String findAllRole(){
		ActionContext.getContext().put("rolelist", this.userServiceDao.findAllRole());
		return "findAllRole";
	}
	
	@MethodInfo(name="addUser")
	public String selectRoleDesc(){
		ServletActionContext.getResponse().setContentType("text/json");
		ServletActionContext.getResponse().setCharacterEncoding("UTF-8");
		
		Role role=this.userServiceDao.findByRId(this.userRole.getRId());
		String desc=role.getRDesc();
		List<String> list=new ArrayList<String>();
		list.add(desc);
		JSONArray js=JSONArray.fromObject(list);
		System.out.println(js);
		try {
			ServletActionContext.getResponse().getWriter().print(js);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@MethodInfo(name="updateUser")
	public String updateUser(){
		User user=this.userServiceDao.findByUId(this.userRole.getUId());
		BeanUtils.copyProperties(this.userRole, user);
		Role role=this.userServiceDao.findByRId(this.userRole.getRId());
        user.setRole(role);
		this.userServiceDao.updateUser(user);
		return "updateUser";
	}
	
	@MethodInfo(name="updateUser")
	public String selectOneUser(){
		User_Role userRole=this.userServiceDao.selectOneUser(this.userRole.getUId());
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.push(userRole);
		ActionContext.getContext().put("rolelist", this.userServiceDao.findAllRole());
		return "selectOneUser";
	}
	
	
	
	
	
	
	@Override
	public User_Role getModel() {
		return userRole;
	}

	public UserServiceDao getUserServiceDao() {
		return userServiceDao;
	}

	public void setUserServiceDao(UserServiceDao userServiceDao) {
		this.userServiceDao = userServiceDao;
	}

	public User_Role getUserRole() {
		return userRole;
	}

	public void setUserRole(User_Role userRole) {
		this.userRole = userRole;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}

}
