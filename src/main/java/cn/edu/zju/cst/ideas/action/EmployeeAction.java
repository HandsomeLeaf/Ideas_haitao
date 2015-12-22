package cn.edu.zju.cst.ideas.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import cn.edu.zju.cst.ideas.domain.Employee;
import cn.edu.zju.cst.ideas.service.IEmployeeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport{
	
	@Resource
	private IEmployeeService employeeService;
	
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public String list() {
		List<Employee> emplist = employeeService.getAll();
		Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		request.put("empList", emplist);
		return "list";
	}

}
