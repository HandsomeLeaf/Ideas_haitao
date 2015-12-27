package cn.edu.zju.cst.ideas.dao.impl;

import org.springframework.stereotype.Repository;

import cn.edu.zju.cst.ideas.dao.IGoodsDao;
import cn.edu.zju.cst.ideas.domain.Goods;



@Repository(IGoodsDao.SERVICE_NAME)
public class GoodsDaoImpl extends BaseDaoImpl<Goods> implements IGoodsDao{

	public int getGoodsCount(int typeId)
	{
		getSession().createQuery("from goodsinfo where type_id in (:type_id)");
		return 0;
	}
	
	public int  getAveragePrice(int typeId)
	{
		return 0;
	}
}
