package cn.edu.zju.cst.ideas.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.zju.cst.ideas.domain.Goods;
import cn.edu.zju.cst.ideas.service.IGoodsService;

public class SearchAction extends ActionSupport{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String searchContext;
	
	@Resource
	private IGoodsService goodService;
	
	public String getSearchContext() {
		return searchContext;
	}
	public void setSearchContext(String searchContext) {
		this.searchContext = searchContext;
	}
	public String search() {
        System.out.print("searchContext"+searchContext);
        List<Goods> goodList = new ArrayList<>();
        goodList = goodService.getGoodLists(searchContext);
        ActionContext actionContext=ActionContext.getContext();
		HttpServletRequest request=(HttpServletRequest)actionContext.get(ServletActionContext.HTTP_REQUEST);
        request.setAttribute("goodList",goodList);
        System.out.println(goodList.get(1));
		return "search";
    }

}
