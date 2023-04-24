package aaa.bbb.bookui;

import aaa.bbb.base.BaseUI;
import aaa.bbb.service.BookService;
import aaa.bbb.vo.BookVO;

public class BookAddUI extends BaseUI {

	private BookService bookService;

	public BookAddUI() {
	    bookService = new BookService(); 
	}

	@Override
	public void execute() throws Exception {
	    String title = scanStr("등록할 제목을 입력하세요 : ");
	    String writer = scanStr("글쓴이를 입력하세요 : ");
	    String publisher = scanStr("출판사를 입력하세요 : ");
	    int stock = scanInt("수량을 입력하세요 : ");

	    // 중복 체크
	    if (bookService.isBookExists(title, writer, publisher)) {
	        System.out.println("이미 등록된 도서입니다.");
	        return;
	    }

	    BookVO book = new BookVO();
	    book.setTitle(title);
	    book.setWriter(writer);
	    book.setPublisher(publisher);
	    book.setStock(stock);

	    bookService.addBook(book);

	    System.out.println("새로운 도서가 등록 되었습니다");
	}

}