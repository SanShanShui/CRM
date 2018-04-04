package com.zy.serviceDao.imp;

import java.util.List;

import javax.annotation.Resource;




import org.springframework.stereotype.Service;

import com.zy.departmentDao.DepartmentDao;
import com.zy.serviceDao.DepartmentServiceDao;
import com.zy.vo.Department;

@Service("departmentServiceDao")
public class DepartmentServiceDaoImp implements DepartmentServiceDao{

	@Resource(name="departmentDao")
	private DepartmentDao departmentDao;
	
	
	
	@Override
	public List<Department> findAll(int start) {

		return this.departmentDao.findAll(start);
	}

	@Override
	public void addDepartment(Department dep) {
		
		this.departmentDao.addDepartment(dep);
	}

	@Override
	public void delDepartment(Integer DId) {
		this.departmentDao.delDepartment(DId);
	}

	@Override
	public Department findByDId(Integer DId) {
		
		return this.departmentDao.findByDId(DId);
	}

	@Override
	public void updateDepartment(Department dep) {
		this.departmentDao.updateDepartment(dep);
		
	}
	@Override
	public Integer countPages() {
		
		return this.departmentDao.countPages();
	}





	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}


}
