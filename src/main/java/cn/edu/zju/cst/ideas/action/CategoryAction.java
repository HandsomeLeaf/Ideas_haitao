package cn.edu.zju.cst.ideas.action;

import java.io.IOException;

import javax.annotation.Resource;

import cn.edu.zju.cst.ideas.service.IGoodsService;


public class CategoryAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int typeId;

	@Resource
	private IGoodsService goodService;
	
	public String category() throws IOException{
		
//		Category category = categoryService.getCategoryById(typeId);
//		ActionContext.getContext().put("category", category);
		

		return "category";
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
