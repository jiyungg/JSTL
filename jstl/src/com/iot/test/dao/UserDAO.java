package com.iot.test.dao;

import java.util.List;

import com.iot.test.vo.UserInfo;

public interface UserDAO {
	public List<UserInfo> selectUserList(UserInfo ui);
	public UserInfo selectUser(UserInfo ui); //<-얜 왜 데이터타입이 UserInfo이지? (ㅏ!)
	public int insertUser(UserInfo ui);
	public int updateUser(UserInfo ui);
	public int deleteUser(UserInfo ui);

}
