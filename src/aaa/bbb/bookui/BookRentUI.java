package aaa.bbb.bookui;

import java.util.List;
import java.util.Scanner;

import aaa.bbb.base.BaseUI;
import aaa.bbb.service.BookService;
import aaa.bbb.service.UserService;
import aaa.bbb.vo.BookVO;
import aaa.bbb.vo.UserVO;

public class BookRentUI extends BaseUI {

	private BookService service;
	private UserService userService;

	public BookRentUI() {
		service = new BookService();
		userService = new UserService();
	}

	@Override
	public void execute() throws Exception {

	    // 대출 가능 도서 목록 조회
	    List<BookVO> rentedBooks = service.getBookByRental();
	    if (rentedBooks.isEmpty()) {
	        System.out.println("대출 중인 도서가 없습니다.");
	        return;
	    } else {
	        System.out.println("대출 가능 도서 목록:");
	        System.out.println("--------------------------------------------");
	        System.out.println("NO" + " | " + "제목" + " | " + "글쓴이" + " | " + "출판사" + " | " + "상태");
	        System.out.println("--------------------------------------------");
	        for (BookVO book : rentedBooks) {
	            System.out.println(book.getNo() + " | " + book.getTitle() + " | " + book.getWriter() + " | "
	                    + book.getPublisher() + " | " + book.getRental());
	        }
	        System.out.println("--------------------------------------------");
	    }

	    Scanner sc = new Scanner(System.in);
	    System.out.print("대여할 도서의 번호를 입력하세요: ");
	    int no = sc.nextInt();
	    sc.nextLine();

	    List<UserVO> userList = userService.selectAll();
	    System.out.println("----------------------------------");
	    System.out.println("NO\t이름\t연락처");
	    System.out.println("----------------------------------");

	    if (userList == null || userList.size() == 0) {
	        System.out.println("\t회원이 존재하지 않습니다");
	    } else {
	        for (UserVO user : userList) {
	            System.out.println(user.getNo() + "\t" + user.getName() + "\t" + user.getPhone());
	        }
	    }

	    System.out.print("대여할 회원의 번호를 입력하세요: ");
	    String newRented_by = sc.nextLine();

	    BookVO book = new BookVO();
	    book.setNo(no);
	    book.setRented_by(newRented_by);
	    java.util.Date currentDate = new java.util.Date();
	    book.setRental_date(new java.sql.Date(currentDate.getTime()));

	    service.rentBook(book);

	    System.out.println("도서가 대출되었습니다.");
	    System.out.println();
	}

	
//	@Override
//	public void execute() throws Exception {
//
//		// 대출 가능 도서 목록 조회
//		List<BookVO> rentedBooks = service.getBookByRental();
//		if (rentedBooks.isEmpty()) {
//			System.out.println("대출 중인 도서가 없습니다.");
//			return;
//		} else {
//			System.out.println("대출 가능 도서 목록:");
//			System.out.println("--------------------------------------------");
//			System.out.println("NO" + " | " + "제목" + " | " + "글쓴이" + " | " + "출판사" + " | " + "상태");
//			System.out.println("--------------------------------------------");
//			for (BookVO book : rentedBooks) {
//				System.out.println(book.getNo() + " | " + book.getTitle() + " | " + book.getWriter() + " | "
//						+ book.getPublisher() + " | " + book.getRental());
//			}
//			System.out.println("--------------------------------------------");
//		}
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("대여할 도서의 번호를 입력하세요: ");
//		int No = sc.nextInt();
//		sc.nextLine();
//
//		List<UserVO> userList = addService.selectAll();
//		System.out.println("----------------------------------");
//		System.out.println("NO\t이름\t연락처");
//		System.out.println("----------------------------------");
//
//		if (userList == null || userList.size() == 0) {
//			System.out.println("\t회원이 존재하지 않습니다");
//		} else {
//			for (UserVO user : userList) {
//				System.out.println(user.getNo() + "\t" + user.getName() + "\t" + user.getPhone());
//			}
//		}
//		
//		System.out.print("대여할 회원의 번호를 입력하세요: ");
//		String newRented_by = sc.nextLine();
//
//		BookVO Book = new BookVO();
//		Book.setNo(No);
//		Book.setRented_by(newRented_by);
//		java.util.Date currentDate = new java.util.Date();
//		Book.setRental_date(new java.sql.Date(currentDate.getTime()));
//
//		service.rentBook(Book);
//
//		System.out.println("도서가 대출되었습니다.");
//	}
}
