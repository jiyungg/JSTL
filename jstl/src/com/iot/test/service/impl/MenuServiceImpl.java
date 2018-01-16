package com.iot.test.service.impl;

import javax.servlet.http.HttpServletRequest;

import com.iot.test.dao.MenuDAO;
import com.iot.test.impl.MenuDAOImpl;
import com.iot.test.service.MenuService;

public class MenuServiceImpl implements MenuService {
	MenuDAO mdao = new MenuDAOImpl();
	
	@Override
	public void setMenuList(HttpServletRequest req) {
		req.setAttribute("menuList", mdao.selectMenuList());		
	}

}
