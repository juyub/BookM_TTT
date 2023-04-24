package aaa.bbb.bookui;

import java.util.List;

import aaa.bbb.base.BaseUI;
import aaa.bbb.service.BookService;
import aaa.bbb.vo.BookVO;

public class BookDeleteUI extends BaseUI{
    
	private BookService service;
	
	public BookDeleteUI() {
		service = new BookService();
	}
	
	@Override
	public void execute() throws Exception {
	    List<BookVO> bookList = service.getAllBooks();

	    System.out.println("--------------------------------------------");
	    System.out.println("NO\t제목\t글쓴이\t출판사\t등록일");
	    System.out.println("--------------------------------------------");

	    if (bookList == null || bookList.size() == 0) {
	        System.out.println("\t게시글이 존재하지 않습니다");
	    } else {
	        for (BookVO book : bookList) {
	            System.out.println(book.getNo() + "\t" + book.getTitle() + "\t" + book.getWriter() + "\t"
	                    + book.getPublisher());
	        }
	        System.out.println("--------------------------------------------");
	        int no = scanInt("삭제할 책번호를 입력하세요 : ");
	        service.deleteBook(no);
	        System.out.println("도서가 성공적으로 삭제되었습니다!");
	        System.out.println();
	    }
	}

//	@Override
//	public void execute() throws Exception {
//		List<BookVO> BookList = service.getAllBooks();
//
//		System.out.println("--------------------------------------------");
//		System.out.println("NO\t제목\t글쓴이\t출판사\t등록일");
//		System.out.println("--------------------------------------------");
//		
//		if(BookList == null || BookList.size() == 0) {
//			System.out.println("\t게시글이 존재하지 않습니다");
//		} else {
//			for(BookVO Book : BookList) {
//				System.out.println(Book.getNo()+"\t"
//			                      +Book.getTitle()+"\t"
//								  +Book.getWriter()+"\t"
//								  +Book.getPublisher());
//								 
//				
//				int no = scanInt("삭제할 책번호를 입력하세요 : ");
//				
//				service.deleteBook(no);
//				
//				System.out.println("도서가 성공적으로 삭제되었습니다!");
//				System.out.println();
//			}
//		}
//		System.out.println("--------------------------------------------");
//		System.out.println();
//	
//		}
}

