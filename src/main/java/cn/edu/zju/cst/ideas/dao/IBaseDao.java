package cn.edu.zju.cst.ideas.dao;

import java.util.List;

import cn.edu.zju.cst.ideas.domain.PageBean;
import cn.edu.zju.cst.ideas.util.QueryHelper;

public interface IBaseDao <T>{
	

	/**
	 * get model by id
	 * @param id
	 * @return
	 */
	T getById(Integer id);

	/**
	 * get models by ids
	 * @param ids
	 * @return
	 */
	List<T> getByIds(Long[] ids);

	/**
	 * find all models
	 * @return
	 */
	List<T> findAll();
	
	/**
	 * get a object of PageBean providing pageNum,pageSize and queryHelper
	 * @param pageNum
	 * @param pageSize
	 * @param queryHelper
	 * @return
	 */
	PageBean getPageBean(int pageNum, int pageSize, QueryHelper queryHelper);
	
}
