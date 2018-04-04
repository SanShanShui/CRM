package com.zy.action;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zy.serviceDao.RemoveServiceDao;
import com.zy.util.MethodInfo;
import com.zy.vo.Follow;
import com.zy.vo.Remove;
import com.zy.vo.Stu_Fo_Remove;
import com.zy.vo.Student;

@Controller("removeAction")
@Scope("prototype")
public class RemoveAction extends ActionSupport implements ModelDriven<Stu_Fo_Remove>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource(name="removeServiceDao")
	private RemoveServiceDao removeServiceDao;
	private Stu_Fo_Remove stuFoRemove=new Stu_Fo_Remove();
	private int page;
	private int pages;

	
	@MethodInfo(name="selectGZ")
	public String addRemove(){
		Remove remove=new Remove();
		BeanUtils.copyProperties(this.stuFoRemove, remove);
		
		Follow follow=new Follow();
		follow.setFZxr(this.stuFoRemove.getRNewzxr());
		
		Student student=this.removeServiceDao.selectOneStu(this.stuFoRemove.getSId());
		remove.setROldzxr(student.getSZxr());
		student.setSZxr(this.stuFoRemove.getRNewzxr());
//		Date date=new Date();
		follow.setFDate("2016/1/24");
		follow.setFStatus(student.getSStatus());
		follow.setStudent(student);
		remove.setStudent(student);
		this.removeServiceDao.addRemove(remove);
		this.removeServiceDao.addFollow(follow);
		return "addRemove";
	}
	
	@MethodInfo(name="selectGZ")
	public String selectOneStu(){
		Student student=this.removeServiceDao.selectOneStu(this.stuFoRemove.getSId());
		ActionContext.getContext().getValueStack().push(student);
		return "selectOneStu";
	}
	
	//移交学生信息
	@MethodInfo(name="selectGZ")
	public String findStuRemove(){
		
		if(page==0){
			page=1;
		}
		int counts=this.removeServiceDao.findNewRId();
		if(counts==0){
			pages=1;
		}else if(counts%6==0){
			pages=counts/6;
		}else{
			pages=counts/6+1;
		}
		int start =(page-1)*6;
		List<Stu_Fo_Remove> list=this.removeServiceDao.findNewRemove(start);
		ActionContext.getContext().put("stuRemovelist", list);
		return "findStuRemove";
	}
	
	//移交历史
	@MethodInfo(name="selectGZ")
	public String findAllRemove(){
		
		if(page==0){
			page=1;
		}
		int counts=this.removeServiceDao.countPages();
		if(counts==0){
			pages=1;
		}else if(counts%6==0){
			pages=counts/6;
		}else{
			pages=counts/6+1;
		}
		int start =(page-1)*6;
		List<Stu_Fo_Remove> list=this.removeServiceDao.findALLRemove(start);
		ActionContext.getContext().put("removelist", list);
		return "findAllRemove";
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
	public RemoveServiceDao getRemoveServiceDao() {
		return removeServiceDao;
	}
	public void setRemoveServiceDao(RemoveServiceDao removeServiceDao) {
		this.removeServiceDao = removeServiceDao;
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
