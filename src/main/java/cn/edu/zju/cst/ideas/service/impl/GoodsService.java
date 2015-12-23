package cn.edu.zju.cst.ideas.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import cn.edu.zju.cst.ideas.dao.IGoodsDao;
import cn.edu.zju.cst.ideas.domain.Goods;
import cn.edu.zju.cst.ideas.service.IGoodsService;

@Repository
public class GoodsService extends BaseService<Goods> implements IGoodsService{
	
	@Resource
	private IGoodsDao goodsDao;

	public IGoodsDao getGoodsDao() {
		return goodsDao;
	}

	public void setGoodsDao(IGoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}
}
