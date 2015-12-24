package cn.edu.zju.cst.ideas.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cn.edu.zju.cst.ideas.dao.IBaseDao;
import cn.edu.zju.cst.ideas.domain.PageBean;
import cn.edu.zju.cst.ideas.util.QueryHelper;

@SuppressWarnings("unchecked")
public class BaseDaoImpl<T> implements IBaseDao<T>{
	
	@Resource
	protected SessionFactory sessionFactory;
	private Class<T> clazz;
	
	public BaseDaoImpl(){
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0];
		
	}
	

	/**
	 * get session of current Thread
	 * @return
	 */
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public T getById(Integer id) {
		if (id == null){
			return null;
		}else {
			return (T) getSession().get(clazz, id);
		}
	}

	public List<T> getByIds(Long[] ids) {
		if (ids == null || ids.length == 0) {
			return Collections.EMPTY_LIST;
		} else {
			return getSession().createQuery(//
					"FROM " + clazz.getSimpleName() + " WHERE id IN (:ids)")//
					.setParameterList("ids", ids)//
					.list();
		}
	}

	public List<T> findAll() {
		return getSession().createQuery(//
				"FROM " + clazz.getSimpleName())//
				.list();
	}

	public PageBean getPageBean(int pageNum, int pageSize, QueryHelper queryHelper) {
		//获取所有参数对象
		List<Object> parameters = queryHelper.getParameters();

		// 获取查询语句
		Query listQuery = getSession().createQuery(queryHelper.getListQueryHql()); // ������ѯ����
		if (parameters != null) { // ���ò���
			for (int i = 0; i < parameters.size(); i++) {
				listQuery.setParameter(i, parameters.get(i));
			}
		}
		listQuery.setFirstResult((pageNum - 1) * pageSize);
		listQuery.setMaxResults(pageSize);
		List list = listQuery.list(); // ִ�в�ѯ

		// ��ѯ�ܼ�¼����
		Query countQuery = getSession().createQuery(queryHelper.getCountQueryHql());
		if (parameters != null) { // ���ò���
			for (int i = 0; i < parameters.size(); i++) {
				countQuery.setParameter(i, parameters.get(i));
			}
		}
		Long count = (Long) countQuery.uniqueResult(); // ִ�в�ѯ

		return new PageBean(pageNum, pageSize, count.intValue(), list);
	}

}
