package cn.edu.zju.cst.ideas.dao;

import java.util.List;

import cn.edu.zju.cst.ideas.utils.PageBean;
import cn.edu.zju.cst.ideas.utils.QueryHelper;

public interface IBaseDao<T> {

	/**
	 * 按id查询
	 * 
	 * @param id
	 * @return
	 */
	public <T> T getById(Integer id);
	
	public List<T> getDomainsByTypeId(String typeId);
	
	public List<T> findTopDomainList();

	public List<T> findSubDomainList();
	
	public <T> T getByName(String name);

	/**
	 * 查询多个id的内容
	 * 
	 * @param ids
	 * @return
	 */
	public <T> List<T> getByIds(Long[] ids);

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public <T> List<T> findAll();

	/**
	 * 公共的查询分页信息
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param queryHelper
	 *            HQL语句与参数列表
	 * @return
	 */
	PageBean getPageBean(int pageNum, int pageSize, QueryHelper queryHelper);

}
