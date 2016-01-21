package cn.edu.zju.cst.ideas.service;

import java.util.List;
import java.util.Map;

import cn.edu.zju.cst.ideas.domain.CatagoryStatstic;
import cn.edu.zju.cst.ideas.domain.Goods;

public interface IGoodsInfoService  {
	public Goods getGoodByid(int id);
	public String getGoodsJson(int goodId);
}

