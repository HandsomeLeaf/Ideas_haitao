package cn.edu.zju.cst.ideas.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import cn.edu.zju.cst.ideas.dao.IGoodsInfoDao;
import cn.edu.zju.cst.ideas.domain.Goods;
import cn.edu.zju.cst.ideas.service.IGoodsInfoService;
import cn.edu.zju.cst.ideas.service.IGoodsService;

@Repository
public class GoodsInfoService extends BaseService<Goods> implements IGoodsInfoService{
	
	@Resource
	private IGoodsInfoDao goodsDao;

	public IGoodsInfoDao getGoodsDao() {
		return goodsDao;
	}

	public void setGoodsDao(IGoodsInfoDao goodsDao) {
		this.goodsDao = goodsDao;
	}

	@Override
	public Goods getGoodByid(int id) {
		return goodsDao.getGoodByid(id);
	}
	
}
