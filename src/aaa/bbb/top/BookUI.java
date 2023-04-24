package aaa.bbb.top;

import java.util.Scanner;

import aaa.bbb.base.IBookUI;
import aaa.bbb.bookui.BookAddUI;
import aaa.bbb.bookui.BookAllUI;
import aaa.bbb.bookui.BookDeleteUI;
import aaa.bbb.bookui.BookOneUI;
import aaa.bbb.bookui.BookRentUI;
import aaa.bbb.bookui.BookReturnUI;
import aaa.bbb.bookui.BookUpdateUI;

public class BookUI extends SelectUI {

    private int menu() {
    	System.out.println();
        System.out.println("*** 도서 관리 ***");
        System.out.println("1. 도서 목록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 대여");
        System.out.println("4. 도서 반납");
        System.out.println("5. 도서 등록");
        System.out.println("6. 도서 수정");
        System.out.println("7. 도서 삭제");
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
				System.out.println();
				System.out.println("도서 목록을 출력합니다.");
				// 도서 리스트 로직 구현
				ui = new BookAllUI();
				break;
			case 2:
				System.out.println();
				System.out.println("도서를 검색합니다.");
				// 도서 검색 로직 구현
				ui = new BookOneUI();
				break;
			case 3:
				System.out.println();
				System.out.println("도서를 대여합니다.");
				// 도서 대여 로직 구현
				ui = new BookRentUI();
				break;
			case 4:
				System.out.println();
				System.out.println("도서를 반납합니다.");
				// 도서 반납 로직 구현
				ui = new BookReturnUI();
				break;
			case 5:
				System.out.println();
				System.out.println("도서를 추가합니다.");
				// 도서 등록 로직 구현
				ui = new BookAddUI();
				break;
			case 6:
				System.out.println();
				System.out.println("도서정보를 수정합니다.");
				// 도서 수정 로직 구현
				ui = new BookUpdateUI();
				break;
			case 7:
				System.out.println();
				System.out.println("도서를 삭제합니다.");
				// 도서 삭제 로직 구현
				ui = new BookDeleteUI();
				break;
			case 0:
				System.out.println();
				System.out.println("복귀합니다.");
				return;
			default:
				System.out.println();
				System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
				break;
			}
            if (ui != null) {
            	ui.execute();
            }
        }
    }
}

