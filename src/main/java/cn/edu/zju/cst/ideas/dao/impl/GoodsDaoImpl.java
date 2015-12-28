package cn.edu.zju.cst.ideas.dao.impl;

import java.util.List;

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

	@Override
	public List<Goods> getGoodLists(String searchContext) {
		@SuppressWarnings("unchecked")
		List<Goods> goodLists = getSession().createQuery("from Goods where good_keys like :searchContext ")
					.setString("searchContext", "%" + searchContext + "%")
					.setMaxResults(60)
					.list();
		return goodLists;
	}
}
