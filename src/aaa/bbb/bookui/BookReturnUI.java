package aaa.bbb.bookui;

import java.util.List;
import java.util.Scanner;

import aaa.bbb.base.BaseUI;
import aaa.bbb.service.BookService;
import aaa.bbb.vo.BookVO;
import aaa.bbb.vo.UserVO;

public class BookReturnUI extends BaseUI {

	private BookService service;

	public BookReturnUI() {
		service = new BookService();
	}
	
	@Override
	public void execute() throws Exception {

        // 대출 중인 도서 목록 조회
        List<BookVO> rentedBooks = service.getBookByRented();
        if (rentedBooks.isEmpty()) {
            System.out.println("대출 중인 도서가 없습니다.");
            return;
        } else {
            System.out.println("대출 중인 도서 목록:");
            for (BookVO book : rentedBooks) {
            	UserVO user = book.getUser();
            	System.out.println("---------------------------------------");
            	System.out.println(book.getNo()+" | "
                				  +book.getTitle()+" | "
                				  +book.getWriter()+" | "
                				  +book.getPublisher());
            	System.out.println("---------------------------------------");
            	System.out.println(book.getRental_date()+" | "
                				  +book.getRented_by()+" | "
                				  +user.getPhone());
            	System.out.println("---------------------------------------");
            }
        }

        Scanner sc = new Scanner(System.in);
        // 도서 번호 입력받기
        System.out.print("반납할 도서 번호를 입력하세요: ");
        int bookNo = sc.nextInt();

//        // 도서 번호에 해당하는 도서의 rental 값을 0으로 업데이트
//        BookVO book = service.getBookByNO(bookNo);
//        if (book != null) {
//            book.setRental("0");
//            bookService.updateBook(book);
//            System.out.println("도서 반납이 완료되었습니다.");
//        } else {
//            System.out.println("입력한 도서 번호에 해당하는 도서가 존재하지 않습니다.");
//        }
//
//        scanner.close();
                
        BookVO Book = new BookVO();
        Book.setNo(bookNo);
                
        service.returnBook(Book);
        
        System.out.println();
        System.out.println("도서가 반납되었습니다.");
    }
}
