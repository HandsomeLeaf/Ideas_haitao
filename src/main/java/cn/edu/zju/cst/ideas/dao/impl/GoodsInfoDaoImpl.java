package cn.edu.zju.cst.ideas.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.springframework.stereotype.Repository;

import cn.edu.zju.cst.ideas.dao.IGoodsInfoDao;
import cn.edu.zju.cst.ideas.domain.Goods;
import cn.edu.zju.cst.ideas.domain.GoodsInfo;
import cn.edu.zju.cst.ideas.util.JdbcUtils;

@Repository(IGoodsInfoDao.SERVICE_NAME)
public class GoodsInfoDaoImpl extends BaseDaoImpl<GoodsInfo> implements IGoodsInfoDao {

	@Override
	public Goods getGoodByid(int id) {
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		String sql = "select * from  goodsinfo where goods_id=?";
		Goods good = null;
		try {
		   good = qr.query(sql, new BeanHandler<Goods>(Goods.class),id);
		} catch (SQLException e) {
		}
		return good;
	}
	
	public Map<String, Integer> getHotBrandAndCount() {
		Map<String, Integer> result = new HashMap<String, Integer>();
		try {
			Connection con = JdbcUtils.getConnection();
			String sql = "SELECT (SELECT goods_brand_name FROM brand WHERE goods_brand_id=brand_id) AS brandname,SUM(IFNULL(month_sale_number,0)) AS number FROM goodsinfo"
					+ " WHERE crawling_time='2015-12-17' "
					+ " GROUP BY brand_id "
					+ " ORDER BY number DESC "
					+ " LIMIT 10";
			PreparedStatement pstm = con.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				result.put(rs.getString(1), rs.getInt(2));
			}

		} catch (SQLException e) {
			System.out.println(1);
		}
		return result;
	}
	
}
