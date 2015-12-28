package cn.edu.zju.cst.ideas.dao;

import java.util.List;

import cn.edu.zju.cst.ideas.domain.Goods;

public interface IGoodsDao extends IBaseDao<Goods> {
	public final static String SERVICE_NAME="cn.edu.zju.cst.ideas.dao.IGoodsDao";
	
	public List<Goods> getGoodLists(String searchContext); 
	
}
