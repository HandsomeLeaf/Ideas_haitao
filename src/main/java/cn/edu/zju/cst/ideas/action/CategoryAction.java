package cn.edu.zju.cst.ideas.action;

import java.io.IOException;

import com.opensymphony.xwork2.ActionContext;


public class CategoryAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int typeId;

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
