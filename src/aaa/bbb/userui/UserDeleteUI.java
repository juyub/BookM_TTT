package aaa.bbb.userui;

import java.util.List;

import aaa.bbb.base.BaseUI;
import aaa.bbb.service.UserService;
import aaa.bbb.vo.UserVO;

public class UserDeleteUI extends BaseUI{
    
	private UserService deleteService;
	
	public UserDeleteUI() {
		deleteService = new UserService();
	}
	
	@Override
	public void execute() throws Exception {
		List<UserVO> userList = deleteService.selectAll();

		System.out.println("--------------------------------------------");
		System.out.println("NO\t아이디\t비밀번호\t연락처");
		System.out.println("--------------------------------------------");
		
		if(userList == null || userList.size() == 0) {
			System.out.println("\t회원이 존재하지 않습니다");
		} else {
			for(UserVO User : userList) {
				System.out.println(User.getNo()+"\t"
			                      +User.getName()+"\t"
								  +User.getPhone());
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println();
	
		int no = scanInt("삭제할 회원번호를 입력하세요 : ");
		UserVO User = deleteService.delete(no);
		
		System.out.println("회원정보가 삭제되었습니다!");
		System.out.println();
		}
}