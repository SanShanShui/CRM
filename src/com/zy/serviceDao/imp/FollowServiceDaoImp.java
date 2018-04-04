package com.zy.serviceDao.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zy.followDao.FollowDao;
import com.zy.serviceDao.FollowServiceDao;
import com.zy.vo.Follow;
import com.zy.vo.Stu_Fo_Remove;
import com.zy.vo.Student;
@Service("followServiceDao")
public class FollowServiceDaoImp implements FollowServiceDao{
	
	@Resource(name="followDao")
	private FollowDao followDao;

	@Override
	public List<Stu_Fo_Remove> findALLFollow(int start) {
		return this.followDao.findALLFollow(start);
	}

	@Override
	public int countPages() {
		return this.followDao.countPages();
	}

	@Override
	public void addFollow(Follow f) {
		 this.followDao.addFollow(f);
	}

	@Override
	public Student selectOneStu(Integer SId) {
		return this.followDao.selectOneStu(SId);
	}

	@Override
	public Stu_Fo_Remove selectOneFollow(Integer FId) {
		return this.followDao.selectOneFollow(FId);
	}
	
	
	
	
	


	public FollowDao getFollowDao() {
		return followDao;
	}

	public void setFollowDao(FollowDao followDao) {
		this.followDao = followDao;
	}

}
