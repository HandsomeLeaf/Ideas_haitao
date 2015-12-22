package cn.edu.zju.cst.ideas.dao.impl;

import org.springframework.stereotype.Repository;

import cn.edu.zju.cst.ideas.dao.IGoodsDao;
import cn.edu.zju.cst.ideas.domain.Goods;



@Repository(IGoodsDao.SERVICE_NAME)
public class GoodsDaoImpl extends BaseDaoImpl<Goods> implements IGoodsDao{

}
