package aaa.bbb.top;

import java.util.Scanner;

import aaa.bbb.base.IBookUI;
import aaa.bbb.userui.UserAddUI;
import aaa.bbb.userui.UserAllUI;
import aaa.bbb.userui.UserDeleteUI;
import aaa.bbb.userui.UserOneUI;

public class UserUI extends SelectUI {

    private int menu() {
    	System.out.println();
        System.out.println("*** 회원 관리 ***");
        System.out.println("1. 회원 추가");
        System.out.println("2. 회원 리스트");
        System.out.println("3. 이름 검색");
        System.out.println("4. 회원 삭제");
        System.out.println("0. 복귀");
        System.out.print("선택 : ");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        sc.nextLine();
        return type;
    }

    @Override
    public void execute() throws Exception {

		while (true) {
			int type = menu();
			IBookUI ui = null;
			switch (type) {
			case 1:
				System.out.println("회원을 추가합니다.");
				ui = new UserAddUI();
				break;
			case 2:
				System.out.println("회원 목록을 출력합니다.");
				ui = new UserAllUI();
				break;
			case 3:
				System.out.println("회원명을 검색합니다.");
				ui = new UserOneUI();
				break;
			case 4:
				System.out.println("회원을 삭제합니다.");
				ui = new UserDeleteUI();
				break;
			case 0:
				System.out.println("복귀합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
				break;
			}
			if (ui != null) {
            	ui.execute();
            }
		}
    }
}