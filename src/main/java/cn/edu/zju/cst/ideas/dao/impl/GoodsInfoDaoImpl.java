package cn.edu.zju.cst.ideas.dao.impl;

import org.springframework.stereotype.Repository;

import cn.edu.zju.cst.ideas.dao.GoodsInfoDao;
import cn.edu.zju.cst.ideas.domain.GoodsInfo;

@Repository(GoodsInfoDao.SERVICE_NAME)
public class GoodsInfoDaoImpl extends BaseDaoImpl<GoodsInfo> implements GoodsInfoDao {

}
