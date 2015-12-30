package cn.edu.zju.cst.ideas.service;

import cn.edu.zju.cst.ideas.domain.CatagoryStatstic;


public interface IGoodsService  {
	
	public int getGoodsCount(int typeId);
	public int getAveragePrice(int typeId);
	public CatagoryStatstic getCatagoryStatstic(int typeId);
	public String getGoodsJson(int typeId);
	public String getGoodsJson();
}
