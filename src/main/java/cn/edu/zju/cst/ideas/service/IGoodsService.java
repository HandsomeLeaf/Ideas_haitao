package cn.edu.zju.cst.ideas.service;

import java.util.List;

import cn.edu.zju.cst.ideas.domain.Goods;

public interface IGoodsService  {
	
	public int getGoodsCount(int typeId);
	public int getAveragePrice(int typeId);
	public List<Goods> getGoodLists(String searchContext);
}
