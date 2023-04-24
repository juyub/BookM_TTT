package aaa.bbb.bookui;

import aaa.bbb.base.BaseUI;
import aaa.bbb.service.BookService;
import aaa.bbb.vo.BookVO;

public class BookOneUI extends BaseUI {
	
	private BookService service;
	
	public BookOneUI() {
		service = new BookService();
	}

	@Override
	public void execute() throws Exception {
		
		String title = scanStr("조회할 책 제목를 입력하세요 : ");
		BookVO book = service.getBookByTitle(title);
		
		System.out.println("-------------------------");
		if(book != null) {
			System.out.println("  번호  : " + book.getNo());
			System.out.println("  제목  : " + book.getTitle());
			System.out.println("  작성자 : " + book.getWriter());
			System.out.println("  출판사 : " + book.getPublisher());
		} else {
			System.out.println("[" +  title + "]은 존재하지 않습니다");
		}
		
		System.out.println("-------------------------");
	}

}