package com.zy.serviceDao.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zy.serviceDao.StuServiceDao;
import com.zy.stuDao.StudentDao;
import com.zy.vo.Follow;
import com.zy.vo.Stu_Fo_Remove;
import com.zy.vo.Student;
@Service("stuServiceDao")
public class StuServiceDaoImp implements StuServiceDao{

	@Resource(name="studentDao")
	private StudentDao studentDao;
	
	
	@Override
	public List<Stu_Fo_Remove> findALLStu(int start) {
		return this.studentDao.findALLStu(start);
	}
	
	@Override
	public int countPages() {
		
		return this.studentDao.countPages();
	}
	
	@Override
	public void addStu(Follow f) {
		this.studentDao.addUser(f);
		
	}
	
	@Override
	public Student selectOneStu(Integer SId) {
		
		return this.studentDao.selectOneStu(SId);
	}

	@Override
	public void updateStu(Student stu) {
		this.studentDao.updateStu(stu);
		
	}
	
	












	public StudentDao getStudentDao() {
		return studentDao;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
