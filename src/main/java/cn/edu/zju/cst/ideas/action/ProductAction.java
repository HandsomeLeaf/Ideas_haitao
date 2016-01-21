package cn.edu.zju.cst.ideas.action;

import java.io.IOException;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.zju.cst.ideas.domain.Goods;
import cn.edu.zju.cst.ideas.service.IGoodsInfoService;

public class ProductAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int goodsId;
	@Resource
	private IGoodsInfoService goodInfoService;
	

	public String product() throws IOException{
		Goods productDetail = goodInfoService.getGoodByid(goodsId);
		ActionContext.getContext().getValueStack().push(productDetail);
		return "product";
	}
}
