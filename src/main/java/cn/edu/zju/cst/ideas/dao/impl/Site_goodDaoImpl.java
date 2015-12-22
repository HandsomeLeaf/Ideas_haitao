package cn.edu.zju.cst.ideas.dao.impl;

import org.springframework.stereotype.Repository;

import cn.edu.zju.cst.ideas.dao.ISite_goodDao;
import cn.edu.zju.cst.ideas.domain.Site_good;



@Repository(ISite_goodDao.SERVICE_NAME)
public class Site_goodDaoImpl extends BaseDaoImpl<Site_good> implements ISite_goodDao{

}
