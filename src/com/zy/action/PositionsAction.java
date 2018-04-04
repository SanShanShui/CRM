package com.zy.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zy.serviceDao.PositionsServiceDao;
import com.zy.vo.Positions;
@Controller("positionsAction")
@Scope("prototype")//多例
public class PositionsAction extends ActionSupport implements ModelDriven<Positions>{

	/**
	 * 部门管理Action
	 */
	private static final long serialVersionUID = 1L;
	@Resource(name="positionsServiceDao")
	private PositionsServiceDao positionsServiceDao;
	private Positions positions=new Positions();
	private int page;
	
	public String findAll(){
		int start =0;
		ActionContext.getContext().put("list", this.positionsServiceDao.findAll(start));
		return "findAllPos";
		
	}
	
	
	public PositionsServiceDao getPositionsServiceDao() {
		return positionsServiceDao;
	}

	public void setPositionsServiceDao(PositionsServiceDao positionsServiceDao) {
		this.positionsServiceDao = positionsServiceDao;
	}

	public Positions getPositions() {
		return positions;
	}

	public void setPositions(Positions positions) {
		this.positions = positions;
	}

	@Override
	public Positions getModel() {
		return positions;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	
}
