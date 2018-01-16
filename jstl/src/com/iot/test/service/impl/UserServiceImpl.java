package com.iot.test.service.impl;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import com.iot.test.dao.UserDAO;
import com.iot.test.dao.UserDAOImpl;
import com.iot.test.service.UserService;
import com.iot.test.vo.UserInfo;

public class UserServiceImpl implements UserService {
	UserDAO udao = new UserDAOImpl();
	Gson gs = new Gson();

	@Override
	public void getUserList(HttpServletRequest req) {
		//키값을 param으로 주고, 키 값을 파싱한다고 생각할게요.
		//우선 null인지 아닌지를 먼저 체크해야합니다.
		UserInfo ui = null;
		String json = req.getParameter("param");
		if(json!=null) {
			ui = gs.fromJson(json, UserInfo.class);
		}
		req.setAttribute("userList", udao.selectUserList(ui));
	}

	@Override
	public void getUser(HttpServletRequest req) {

	}

	@Override
	public void insertUser(HttpServletRequest req) {

	}

	@Override
	public void updateUser(HttpServletRequest req) {

	}

	@Override
	public void deleteUser(HttpServletRequest req) {

	}

}
