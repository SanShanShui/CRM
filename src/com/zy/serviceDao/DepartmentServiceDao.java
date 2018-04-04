package com.zy.serviceDao;

import java.util.List;

import com.zy.vo.Department;

public interface DepartmentServiceDao {

	public List<Department> findAll(int start);
	public void addDepartment(Department dep);
	public void delDepartment(Integer DId);
	public Department findByDId(Integer DId);
	public void updateDepartment(Department dep);
	public Integer countPages();
}
