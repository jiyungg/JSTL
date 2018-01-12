package com.jstl.test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jstl.test.service.UserService;
import com.jstl.test.service.impl.UserServiceImpl;

public class JspServlet extends HttpServlet {

	public String getCommand(String uri) {
		int idx = uri.lastIndexOf(".");
		if (idx != -1) {
			return uri.substring(0, idx);
		}
		return "";
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doProcess(req, res);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doProcess(req, res);
	}

	public void doProcess(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException {
		String uri = req.getRequestURI();
		uri = uri.replace("jstl", "");
		uri = 	"/WEB-INF" + uri + ".jsp" ;
		
		if(uri.indexOf("user/list")!=-1) {
			UserService us = new UserServiceImpl();
			us.getUserList(req);			
		}
		RequestDispatcher rd = req.getRequestDispatcher(uri);
		rd.forward(req, res);	
	}
}
