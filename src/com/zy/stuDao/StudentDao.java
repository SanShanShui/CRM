package com.zy.stuDao;

import java.util.List;

import com.zy.vo.Follow;
import com.zy.vo.Stu_Fo_Remove;
import com.zy.vo.Student;


public interface StudentDao {
	public List<Stu_Fo_Remove> findALLStu(int start);
    public int countPages();
    public void addUser(Follow f);
    public Student selectOneStu(Integer SId);
    public void updateStu(Student stu);
}
