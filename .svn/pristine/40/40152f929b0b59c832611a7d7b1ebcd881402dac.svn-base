package com.zy.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zy.serviceDao.StuServiceDao;
import com.zy.util.MethodInfo;
import com.zy.vo.Follow;
import com.zy.vo.Stu_Fo_Remove;
import com.zy.vo.Student;

@Controller("studentAction")
@Scope("prototype")
public class StudentAction extends ActionSupport implements ModelDriven<Stu_Fo_Remove>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Resource(name="stuServiceDao")
	private StuServiceDao stuServiceDao;
	private Stu_Fo_Remove stuFoRemove=new Stu_Fo_Remove();
	private int page;
	private int pages;
	//分页查询
	@MethodInfo(name="selectStu")
	public String findAllStu(){
		if(page==0){
			page=1;
		}
		int counts=this.stuServiceDao.countPages();
		if(counts==0){
			pages=1;
		}else if(counts%6==0){
			pages=counts/6;
		}else{
			pages=counts/6+1;
		}
		int start=(page-1)*6;
		List<Stu_Fo_Remove> list=this.stuServiceDao.findALLStu(start);
		ActionContext.getContext().put("stulist", list);
		return "findAllStu";
	}
	
	@MethodInfo(name="addStu")
	public String addStu(){
		Student stu=new Student();
		Follow f=new Follow();
		BeanUtils.copyProperties(this.stuFoRemove, stu);
		BeanUtils.copyProperties(this.stuFoRemove, f);
		f.setStudent(stu);
		f.setFZxr(stu.getSZxr());
		f.setFStatus(stu.getSStatus());
		this.stuServiceDao.addStu(f);
		return "addStu";
	}
	
	@MethodInfo(name="updateStu")
	public String selectOneStu(){
		Student stu=this.stuServiceDao.selectOneStu(stuFoRemove.getSId());
		ActionContext.getContext().getValueStack().push(stu);
		return "selectOneStu";
		
	}
	
	@MethodInfo(name="updateStu")
	public String selectStu(){
		Student stu=this.stuServiceDao.selectOneStu(stuFoRemove.getSId());
		ActionContext.getContext().getValueStack().push(stu);
		return "selectStu";
		
	}
	
	@MethodInfo(name="updateStu")
	public String updateStu(){
		Student stu=this.stuServiceDao.selectOneStu(stuFoRemove.getSId());
		BeanUtils.copyProperties(this.stuFoRemove, stu);
		this.stuServiceDao.updateStu(stu);
		return "updateStu";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public Stu_Fo_Remove getModel() {
		
		return stuFoRemove;
	}

	public StuServiceDao getStuServiceDao() {
		return stuServiceDao;
	}

	public void setStuServiceDao(StuServiceDao stuServiceDao) {
		this.stuServiceDao = stuServiceDao;
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
