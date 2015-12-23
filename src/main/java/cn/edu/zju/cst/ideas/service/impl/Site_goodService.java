package cn.edu.zju.cst.ideas.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import cn.edu.zju.cst.ideas.dao.ISite_goodDao;
import cn.edu.zju.cst.ideas.domain.Site_good;
import cn.edu.zju.cst.ideas.service.ISite_goodService;

@Repository
public class Site_goodService extends BaseService<Site_good> implements ISite_goodService{
	
	@Resource
	private ISite_goodDao site_goodDao;

	public ISite_goodDao getSite_goodDao() {
		return site_goodDao;
	}

	public void setSite_goodDao(ISite_goodDao site_goodDao) {
		this.site_goodDao = site_goodDao;
	}
}
