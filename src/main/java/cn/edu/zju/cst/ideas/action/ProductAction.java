package cn.edu.zju.cst.ideas.action;

import java.io.IOException;

import javax.annotation.Resource;

import cn.edu.zju.cst.ideas.service.IGoodsService;

public class ProductAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int goodsId;
	@Resource
	private IGoodsService goodService;
	
	public int getGoods_id() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String product() throws IOException{
		System.out.println(goodsId);
		return "product";
	}
}
