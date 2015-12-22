package cn.edu.zju.cst.ideas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.edu.zju.cst.ideas.dao.IEmployeeDao;
import cn.edu.zju.cst.ideas.domain.Employee;
import cn.edu.zju.cst.ideas.service.IEmployeeService;

@Component
public class EmployeeService implements IEmployeeService {

	@Resource
	private IEmployeeDao employeeDao;
	
	public void setEmployeeDao(IEmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public List<Employee> getAll() {
		return employeeDao.getAll();
	}
	
	
}
