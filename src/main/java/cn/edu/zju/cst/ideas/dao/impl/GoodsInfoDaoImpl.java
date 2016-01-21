package cn.edu.zju.cst.ideas.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSONObject;

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
	
	
	@Override
	public String getGoodJson(int goodId) {
		JSONObject jo = new JSONObject();
		return null;
	}
	
	public Map<Date,Float> getPriceDataByTime(int goodId){
		Map<Date,Float> result = new HashMap<Date,Float>();
		Connection con = null;
		ResultSet rs = null;
		try {
			 con = JdbcUtils.getConnection();
			String sql = "SELECT crawling_time,price FROM goodsinfo WHERE brand_id=?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, goodId);
		    rs = pstm.executeQuery();
			while (rs.next()) {
				result.put(rs.getDate(1), rs.getFloat(2));
			}

		} catch (SQLException e) {
		}finally{
			try {
				rs.close();
				con.close();
			} catch (SQLException e) {
			}
		}
		return result;
	}
	
}
