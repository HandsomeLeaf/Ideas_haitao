package cn.edu.zju.cst.ideas.dao.impl;

import org.springframework.stereotype.Repository;

import cn.edu.zju.cst.ideas.dao.ITypeDao;
import cn.edu.zju.cst.ideas.domain.Type;

@Repository(ITypeDao.SERVICE_NAME)
public class TypeDaoImpl extends BaseDaoImpl<Type> implements ITypeDao{

}
