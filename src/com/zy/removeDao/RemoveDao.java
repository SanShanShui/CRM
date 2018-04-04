package com.zy.removeDao;

import java.util.List;

import com.zy.vo.Follow;
import com.zy.vo.Remove;
import com.zy.vo.Stu_Fo_Remove;
import com.zy.vo.Student;

public interface RemoveDao {

	//移交时间=FDate
	public List<Stu_Fo_Remove> findALLRemove(int start);//学生移交历史
    public int countPages();//学生移交历史数量
    public List<Stu_Fo_Remove> findNewRemove(int start);//学生移交
    public int findNewRId();//学生移交数量
    public void addRemove(Remove remove);
    public Student selectOneStu(Integer SId);
    public void addFollow(Follow f);

}
