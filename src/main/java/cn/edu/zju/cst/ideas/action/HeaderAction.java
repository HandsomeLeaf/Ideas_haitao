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
//		menuList.put("����", new String[] { "��Ĥ", "����", "��ʪ˪" });
//		menuList.put("��ˮ", new String[] { "��Ĥ", "����", "��ʪ˪" });
//		menuList.put("���廤��", new String[] { "��Ĥ", "����", "��ʪ˪" });
//		menuList.put("��ʿ����", new String[] { "��Ĥ", "����", "��ʪ˪" });
//		ActionContext actionContext=ActionContext.getContext();
//		HttpServletRequest request=(HttpServletRequest)actionContext.get(ServletActionContext.HTTP_REQUEST);
//        request.setAttribute("menuList",menuList);
		return "header";
    }

}
