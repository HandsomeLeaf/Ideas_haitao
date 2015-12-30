package cn.edu.zju.cst.ideas.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import cn.edu.zju.cst.ideas.dao.ITypeDao;
import cn.edu.zju.cst.ideas.domain.Type;
import cn.edu.zju.cst.ideas.util.JdbcUtils;

@Repository(ITypeDao.SERVICE_NAME)
public class TypeDaoImpl extends BaseDaoImpl<Type> implements ITypeDao{

	@Override
	public String getTypeName(int typeId) {
		
		try {
			Connection con = JdbcUtils.getConnection();
			String sql = "select type_name from typeinfo where type_id=?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, typeId);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				return rs.getString(1);
			}

		} catch (SQLException e) {

		}

		return null;
	}

}
