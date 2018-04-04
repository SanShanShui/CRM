package com.zy.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zy.serviceDao.UserServiceDao;
import com.zy.vo.User;
@Controller("loginAction")
@Scope("prototype")
public class LoginAction extends ActionSupport implements ModelDriven<User>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource(name="userServiceDao")
	private UserServiceDao userServiceDao;
	private User user=new User();
	
	
	@SuppressWarnings("unchecked")
	public String login(){
		Boolean b=this.userServiceDao.panduan(user.getUUsername(), user.getUPassword());
		if(b){
			//获取权限
			this.userServiceDao.selectPrivilege(user.getUUsername());
			ServletActionContext.getRequest().getSession().setAttribute("username", user.getUUsername());
//			List<String> list=	(List<String>) ServletActionContext.getRequest().getSession().getAttribute("privilege");
//System.out.println(list);
			//角色判断 （1 应该查出来与RId比较）
            int RId=this.userServiceDao.selectUser_Role(user.getUUsername());
			if(RId==1){
				ServletActionContext.getRequest().getSession().setAttribute("super", "super");
			}else{
				ServletActionContext.getRequest().getSession().setAttribute("super", "pop");
			}
			return SUCCESS;
		}
		return LOGIN;
	}

	@Override
	public User getModel() {
		return user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserServiceDao getUserServiceDao() {
		return userServiceDao;
	}

	public void setUserServiceDao(UserServiceDao userServiceDao) {
		this.userServiceDao = userServiceDao;
	}

}
