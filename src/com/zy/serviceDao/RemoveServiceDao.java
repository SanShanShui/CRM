package com.zy.serviceDao;

import java.util.List;

import com.zy.vo.Follow;
import com.zy.vo.Remove;
import com.zy.vo.Stu_Fo_Remove;
import com.zy.vo.Student;

public interface RemoveServiceDao {

	public List<Stu_Fo_Remove> findALLRemove(int start);
    public int countPages();
    public List<Stu_Fo_Remove> findNewRemove(int start);//学生移交
    public int findNewRId();//学生移交数量
    public void addRemove(Remove Remove);
    public Student selectOneStu(Integer SId);
    public void addFollow(Follow f);
}
