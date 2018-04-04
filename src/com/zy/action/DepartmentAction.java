package com.zy.action;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.zy.serviceDao.DepartmentServiceDao;
import com.zy.vo.Department;

@Controller("departmentAction")
@Scope("prototype")//多例（页面验证，开启一次,执行多例）
public class DepartmentAction extends ActionSupport implements ModelDriven<Department>{

	/**
	 * 部门信息
	 */
	private static final long serialVersionUID = 1L;
	
	@Resource(name="departmentServiceDao")
	private DepartmentServiceDao departmentServiceDao;
	private int page;
	private int pages;
	private Department department=new Department();
	
	public String findAll(){
		if(page==0){
			page=1;
		}
		int start=0;
		int counts=this.departmentServiceDao.countPages();
		if(counts==0){
			pages=1;
		}else if(counts%6==0){
			pages=counts/6;
		}else{
			pages=counts/6+1;
		}
		
		start=(page-1)*6;
		ActionContext.getContext().put("list", this.departmentServiceDao.findAll(start));
		return "findAllDep";
		
	}
	
	public String addDepartment(){
		Department dep=new Department();
		//把取得的this.department复制给dep
		BeanUtils.copyProperties(this.department, dep);
		this.departmentServiceDao.addDepartment(dep);
		return "add";
	}
	public String delDep(){

		this.departmentServiceDao.delDepartment(this.department.getDId());
		return "del";
		
	}
	
	public String findById(){
		//自封装对象
		Department department=this.departmentServiceDao.findByDId(this.department.getDId());
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.push(department);

		return "findByIdDep";
	}
	public String updateDep(){
		Department dep=new Department();		
		BeanUtils.copyProperties(this.department, dep);
		this.departmentServiceDao.updateDepartment(dep);
		return "update";
		
	}


	
	
	


	public DepartmentServiceDao getDepartmentServiceDao() {
		return departmentServiceDao;
	}

	public void setDepartmentServiceDao(DepartmentServiceDao departmentServiceDao) {
		this.departmentServiceDao = departmentServiceDao;
	}

	@Override
	public Department getModel() {
		return department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
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
