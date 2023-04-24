package aaa.bbb.bookui;

import java.util.List;

import aaa.bbb.base.BaseUI;
import aaa.bbb.ccc.BookServiceFactory;
import aaa.bbb.service.BookService;
import aaa.bbb.vo.BookVO;

public class BookAllUI extends BaseUI{

	private BookService BookService;
	
	public BookAllUI() {
		BookService = BookServiceFactory.getInstance();
	}
	
	@Override
	public void execute() throws Exception {
		List<BookVO> BookList = BookService.getAllBooks();
		
		System.out.println("--------------------------------------------");
		System.out.println("NO"+" | "+"제목"+" | "+"글쓴이"+" | "+"출판사"+" | "+"상태");
		System.out.println("--------------------------------------------");
		
		if(BookList == null || BookList.size() == 0) {
			System.out.println("\t도서가 존재하지 않습니다");
		} else {
			for(BookVO Book : BookList) {
				System.out.println(Book.getNo()+" | "
			                      +Book.getTitle()+" | "
								  +Book.getWriter()+" | "
								  +Book.getPublisher()+" | "
								  +Book.getRental());
			}
		}
		
		System.out.println("--------------------------------------------");
	}
	
}
