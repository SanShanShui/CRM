package com.zy.serviceDao.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zy.positionDao.PositionsDao;
import com.zy.serviceDao.PositionsServiceDao;
import com.zy.vo.Positions;
@Service("positionsServiceDao")
public class PositionsServiceDaoImp implements PositionsServiceDao{

	@Resource(name="positionsDao")
	private PositionsDao positionsDao;
	@Override
	public List<Positions> findAll(int start) {
		return this.positionsDao.findAll(start);
	}
	
	
	
	
	public PositionsDao getPositionsDao() {
		return positionsDao;
	}
	public void setPositionsDao(PositionsDao positionsDao) {
		this.positionsDao = positionsDao;
	}

}
