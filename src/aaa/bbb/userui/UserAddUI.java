package aaa.bbb.userui;

import aaa.bbb.base.BaseUI;
import aaa.bbb.ccc.userServiceFactory;
import aaa.bbb.service.UserService;
import aaa.bbb.vo.UserVO;

public class UserAddUI extends BaseUI{

	private UserService userService;

	public UserAddUI() {
		userService = userServiceFactory.getInstance();
	}

	@Override
	public void execute() throws Exception {
		
		String name = scanStr("등록할 이름을 입력하세요 : ");
		String phone = scanStr("등록할 연락처를 입력하세요 : ");
		
		UserVO user = new UserVO();
		user.setName(name);
		user.setPhone(phone);
		
		userService.add(user);
		
		System.out.println("---------------");
		System.out.println("회원이 추가되었습니다");
		System.out.println("---------------");
		System.out.println();
		
	}
}
