package cn.edu.zju.cst.ideas.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import cn.edu.zju.cst.ideas.dao.ITypeDao;
import cn.edu.zju.cst.ideas.domain.Site;
import cn.edu.zju.cst.ideas.service.ISiteService;

@Repository
public class TypeService extends BaseService<Site> implements ISiteService{
	
	@Resource
	private ITypeDao typeDao;

	public ITypeDao getTypeDao() {
		return typeDao;
	}

	public void setTypeDao(ITypeDao typeDao) {
		this.typeDao = typeDao;
	}
}
