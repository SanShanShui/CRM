package com.zy.serviceDao.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zy.removeDao.RemoveDao;
import com.zy.serviceDao.RemoveServiceDao;
import com.zy.vo.Follow;
import com.zy.vo.Remove;
import com.zy.vo.Stu_Fo_Remove;
import com.zy.vo.Student;

@Service("removeServiceDao")
public class RemoveServiceDaoImp implements RemoveServiceDao{

	@Resource(name="removeDao")
	private RemoveDao removeDao;
	
	@Override
	public List<Stu_Fo_Remove> findALLRemove(int start) {
		return this.removeDao.findALLRemove(start);
	}

	@Override
	public int countPages() {
		return this.removeDao.countPages();
	}

	@Override
	public List<Stu_Fo_Remove> findNewRemove(int start) {
		return this.removeDao.findNewRemove(start);
	}

	@Override
	public int findNewRId() {
		return this.removeDao.findNewRId();
	}
	
	@Override
	public void addRemove(Remove remove) {
        this.removeDao.addRemove(remove);		
	}

	@Override
	public void addFollow(Follow f) {
        this.removeDao.addFollow(f);		
	}

	@Override
	public Student selectOneStu(Integer SId) {
		return this.removeDao.selectOneStu(SId);
	}

	public RemoveDao getRemoveDao() {
		return removeDao;
	}

	public void setRemoveDao(RemoveDao removeDao) {
		this.removeDao = removeDao;
	}

	
}
