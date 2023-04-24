package aaa.bbb.userui;

import aaa.bbb.base.BaseUI;
import aaa.bbb.service.UserService;
import aaa.bbb.vo.UserVO;

public class UserOneUI extends BaseUI {

	private UserService service;

	public UserOneUI() {
		service = new UserService();
	}

	@Override
	public void execute() throws Exception {

	    String name = scanStr("조회할 이름을 입력하세요 : ");
	    UserVO user = service.selectUserByName(name);

	    if (user == null) {
	        System.out.println("[" + name + "]은 존재하지 않습니다");
	    } else {
	        System.out.println("-------------------------------");
	        System.out.println(" 회원번호 : " + user.getNo());
	        System.out.println(" 이름    : " + user.getName());
	        System.out.println(" 연락처   : " + user.getPhone());
	        System.out.println("-------------------------------");
	    }
	}
	
//	@Override
//    public void execute() throws Exception {
//
//        String name = scanStr("조회할 이름을 입력하세요 : ");
//        List<UserVO> userList = service.selectUsersByName(name); // 여러 사용자 정보를 리스트로 받아옴
//
//        if (userList == null || userList.isEmpty()) { // 리스트가 비어있으면 조회된 사용자가 없는 경우
//            System.out.println("[" + name + "]에 해당하는 사용자가 존재하지 않습니다");
//        } else {
//            System.out.println("-------------------------------");
//            for (UserVO user : userList) { // 리스트에 있는 모든 사용자 정보 출력
//                System.out.println(" 회원번호 : " + user.getNo());
//                System.out.println(" 이름    : " + user.getName());
//                System.out.println(" 연락처   : " + user.getPhone());
//                System.out.println("-------------------------------");
//            }
//        }
//    }

}
