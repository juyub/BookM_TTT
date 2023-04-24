package aaa.bbb.service;

import java.util.List;

import aaa.bbb.dao.UserDAO;
import aaa.bbb.vo.UserVO;

public class UserService {

	private UserDAO userDao;

	public UserService() {
		userDao = new UserDAO();
	}

	public void add(UserVO user) {
		userDao.addUser(user);
	}

	public List<UserVO> selectAll() {
		List<UserVO> userList = userDao.selectAllUser();
		return userList;
	}

	public UserVO selectByNo(int userNo) {
		UserVO user = userDao.selectUserByNo(userNo);
		return user;
	}
	
	public UserVO delete(int No) {
		UserVO user = userDao.deleteUser(No);
		return user;
	}

	public UserVO selectUserByName(String name) {
	    return userDao.selectUserByName(name);
	}

//	public List<UserVO> selectUsersByName(String name) {
//		return null;
//	}

}
