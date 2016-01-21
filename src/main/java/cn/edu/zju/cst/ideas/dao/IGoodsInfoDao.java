package cn.edu.zju.cst.ideas.dao;

import cn.edu.zju.cst.ideas.domain.Goods;
import cn.edu.zju.cst.ideas.domain.GoodsInfo;

public interface IGoodsInfoDao extends IBaseDao<GoodsInfo> {
	public final static String SERVICE_NAME = "cn.edu.zju.cst.ideas.dao.GoodsInfoDao";
	
	public Goods getGoodByid(int id);

	public String getGoodJson(int goodId);
}
