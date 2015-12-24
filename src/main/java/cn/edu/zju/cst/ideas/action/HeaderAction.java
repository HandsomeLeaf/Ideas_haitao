package cn.edu.zju.cst.ideas.action;

//import com.opensymphony.xwork2.ActionContext;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import cn.edu.zju.cst.ideas.domain.Type;
import cn.edu.zju.cst.ideas.service.ITypeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class HeaderAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//private Long parentId;

	@Resource
	private ITypeService typeService;
	
	public ITypeService getTypeService() {
		return typeService;
	}

	public void setTypeService(ITypeService typeService) {
		this.typeService = typeService;
	}

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
		
		List<Type> typeList = typeService.findAll();
		Map<String,Object> request =(Map<String,Object>)  ActionContext.getContext().get("request");
		request.put("typeList", typeList);
		return "header";
    }

}
