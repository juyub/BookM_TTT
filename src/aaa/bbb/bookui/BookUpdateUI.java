package aaa.bbb.bookui;

import java.util.Scanner;

import aaa.bbb.base.BaseUI;
import aaa.bbb.ccc.BookServiceFactory;
import aaa.bbb.service.BookService;
import aaa.bbb.vo.BookVO;

public class BookUpdateUI extends BaseUI {

    private BookService service;

    public BookUpdateUI() {
        service = BookServiceFactory.getInstance();
    }

    @Override
    public void execute() throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 도서의 번호를 입력하세요: ");
        int No = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("새로운 제목을 입력하세요: ");
        String newTitle = sc.nextLine();
        System.out.print("새로운 작가를 입력하세요: ");
        String newWriter = sc.nextLine();
        System.out.print("새로운 출판사를 입력하세요: ");
        String newPublisher = sc.nextLine();
        System.out.print("새로운 수량을 입력하세요: ");
        int newStock = sc.nextInt();
        
        BookVO Book = new BookVO();
        Book.setNo(No);
        Book.setTitle(newTitle);
        Book.setWriter(newWriter);
        Book.setPublisher(newPublisher);
        Book.setStock(newStock);
        
        service.updateBook(Book);
        
        System.out.println("도서 정보가 성공적으로 수정되었습니다.");
        
    }
}
