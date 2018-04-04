package com.zy.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zy.serviceDao.FollowServiceDao;
import com.zy.util.MethodInfo;
import com.zy.vo.Follow;
import com.zy.vo.Stu_Fo_Remove;
import com.zy.vo.Student;
@Controller("followAction")
@Scope("prototype")
public class FollowAction extends ActionSupport implements ModelDriven<Stu_Fo_Remove>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource(name="followServiceDao")
	private FollowServiceDao followServiceDao;
	private Stu_Fo_Remove stuFoRemove=new Stu_Fo_Remove();
	private int page;
	private int pages;

	@MethodInfo(name="selectGZ")
	public String findAllFollow(){
		if(page==0){
			page=1;
		}
		int counts=this.followServiceDao.countPages();
		if(counts==0){
			pages=1;
		}else if(counts%6==0){
			pages=counts/6;
		}else{
			pages=counts/6+1;
		}
		int start =(page-1)*6;
		List<Stu_Fo_Remove> list=this.followServiceDao.findALLFollow(start);
		ActionContext.getContext().put("followlist", list);
		return "findAllFollow";
	}
	
	@MethodInfo(name="selectGZ")
	public String findSId(){
		Student stu=this.followServiceDao.selectOneStu(this.stuFoRemove.getSId());
		ActionContext.getContext().getValueStack().push(stu);
		return "findSId";
	}
	
	@MethodInfo(name="selectGZ")
    public String addFollow(){
    	Follow f=new Follow();
    	BeanUtils.copyProperties(this.stuFoRemove, f);
    	Student stu=this.followServiceDao.selectOneStu(this.stuFoRemove.getSId());
    	stu.setSStatus(this.stuFoRemove.getFStatus());
    	f.setFZxr(stu.getSZxr());
    	f.setStudent(stu);
    	this.followServiceDao.addFollow(f);
    	return "addFollow";
    }
	
	@MethodInfo(name="selectGZ")
	public String findFId(){
		Stu_Fo_Remove stuFoRemove=this.followServiceDao.selectOneFollow(this.stuFoRemove.getFId());
		ActionContext.getContext().getValueStack().push(stuFoRemove);
		return "findFId";
		
	}
	
	
	@Override
	public Stu_Fo_Remove getModel() {
		return stuFoRemove;
	}

	public Stu_Fo_Remove getStuFoRemove() {
		return stuFoRemove;
	}

	public void setStuFoRemove(Stu_Fo_Remove stuFoRemove) {
		this.stuFoRemove = stuFoRemove;
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

}
