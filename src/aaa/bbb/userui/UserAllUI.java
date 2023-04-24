package aaa.bbb.userui;

import java.util.List;

import aaa.bbb.base.BaseUI;
import aaa.bbb.ccc.userServiceFactory;
import aaa.bbb.service.UserService;
import aaa.bbb.vo.UserVO;

public class UserAllUI extends BaseUI{

	private UserService addService;
	
	public UserAllUI() {
		addService = userServiceFactory.getInstance();
	}
	
	@Override
	public void execute() throws Exception {
		List<UserVO> userList = addService.selectAll();
		
		System.out.println("----------------------------------");
		System.out.println("NO\t이름\t연락처");
		System.out.println("----------------------------------");
		
		if(userList == null || userList.size() == 0) {
			System.out.println("\t회원이 존재하지 않습니다");
		} else {
			for(UserVO user : userList) {
				System.out.println(user.getNo()+"\t"
			                      +user.getName()+"\t"
			                      +user.getPhone());
			}
		}
	}
	
}
