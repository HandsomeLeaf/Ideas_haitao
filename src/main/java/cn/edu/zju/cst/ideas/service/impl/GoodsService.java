package cn.edu.zju.cst.ideas.service.impl;

import java.util.List;

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

	@Override
	public int getGoodsCount(int typeId) {
		
		return 0;
	}

	@Override
	public int getAveragePrice(int typeId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Goods> getGoodLists(String searchContext) {
		List<Goods> goodLists = goodsDao.getGoodLists(searchContext);
		
		return goodLists;
	}
}
