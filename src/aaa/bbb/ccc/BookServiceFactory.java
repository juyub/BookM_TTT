package aaa.bbb.ccc;

import aaa.bbb.service.BookService;

public class BookServiceFactory {

	private static BookService service = null;
	
	public static BookService getInstance() {
		
		if(service == null) {
			service = new BookService();
		}
		
		return service /* new BoardService() */ ;
	}
	
}
