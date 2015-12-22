package cn.edu.zju.cst.ideas.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class HeaderAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//private Long parentId;

	public String header() {
		
//		Map<String, List<Map<Integer, String>>> categoryDetailMap = categoryDetailService.categoryDetailMap();

//		ActionContext.getContext().put("categoryDetailList", categoryDetailMap);
		
//		HashMap<String, String[]> menuList = new HashMap<String, String[]>();
//		menuList.put("护肤", new String[] { "面膜", "洁面", "保湿霜" });
//		menuList.put("香水", new String[] { "面膜", "洁面", "保湿霜" });
//		menuList.put("身体护理", new String[] { "面膜", "洁面", "保湿霜" });
//		menuList.put("男士护理", new String[] { "面膜", "洁面", "保湿霜" });
//		ActionContext actionContext=ActionContext.getContext();
//		HttpServletRequest request=(HttpServletRequest)actionContext.get(ServletActionContext.HTTP_REQUEST);
//        request.setAttribute("menuList",menuList);
		return "header";
    }

}
