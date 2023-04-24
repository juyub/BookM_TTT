package aaa.bbb.top;

import java.util.Scanner;

import aaa.bbb.base.BaseUI;
import aaa.bbb.base.IBookUI;

public class SelectUI extends BaseUI {

    private int menu() {
        System.out.println("*** 관리 프로그램 ***");
        System.out.println("1. 도서관리");
        System.out.println("2. 회원관리");
        System.out.println("3. 종료");
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
                    // 도서 관리
                    ui = new BookUI();
                    break;
                case 2:
                    // 회원 관리
                    ui = new UserUI();
                    break;
                case 3:
                    // 종료
                    System.out.println("프로그램을 종료합니다.");
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
