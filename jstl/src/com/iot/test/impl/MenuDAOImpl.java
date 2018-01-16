package com.iot.test.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iot.test.dao.MenuDAO;
import com.iot.test.test.DBConTest;
import com.iot.test.vo.Menu;

public class MenuDAOImpl implements MenuDAO {

	@Override
	public List<Menu> selectMenuList() {
		List<Menu> menuList = new ArrayList<Menu>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from menu order by mNum";
		
//		con = DBCon.getCon();
		con = DBConTest.getCon();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Menu m = new Menu();
				m.setmNum(rs.getInt("mnum"));
				m.setmName(rs.getString("mname"));
				m.setmUrl(rs.getString("murl"));
				m.setmDesc(rs.getString("mdesc"));		
				menuList.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return menuList;
	}

}
