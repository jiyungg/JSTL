package com.jstl.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.jstl.test.service.UserService;
import com.jstl.test.vo.UserClass;

public class UserServiceImpl implements UserService {
	
	public UserClass getUserClass(int i) {
		UserClass uc = new UserClass();
		uc.setUiNo(i);
		uc.setUiName("이름" + i);
		uc.setUiAge(i);
		uc.setUiId("아이디" + i);
		uc.setAddress("주소" + i);
		return uc;
	}
	private List<UserClass> getUserClassList() {
		List<UserClass> userList = new ArrayList<UserClass>();
		for(int i=1; i<10; i++) {
			UserClass uc = getUserClass(i);
			userList.add(uc);
		}
		return userList;
	}
	
	public void getUserList(HttpServletRequest req) {
		List<UserClass> userList = getUserClassList();
		req.setAttribute("userList", userList);
	}

}
