package aaa.bbb.service;

import java.util.List;

import aaa.bbb.dao.BookDAO;
import aaa.bbb.vo.BookVO;

public class BookService {

	private BookDAO bookDao;

	public BookService() {
		bookDao = new BookDAO();
	}

	// 책 정보 추가
	public void addBook(BookVO book) {
		bookDao.addBook(book);
	}

	// 책 정보 수정
	public void updateBook(BookVO book) {
		bookDao.updateBook(book);
	}

	// 책 정보 삭제
	public void deleteBook(int no) {
		bookDao.deleteBook(no);
	}

	// 모든 책 정보 조회
	public List<BookVO> getAllBooks() {
		return bookDao.getAllBooks();
	}

	// 렌탈 정보 조회
	public List<BookVO> getBookByRental() {
		return bookDao.getBookByRental();
	}
	
	// 대출 도서 목록 조회
	public List<BookVO> getBookByRented() {
		return bookDao.getBookByRented();
	}

	public BookVO getBookByTitle(String title) {
		return bookDao.getBookByTitle(title);
	}

	public BookVO getBookByNO(int no) {
		return bookDao.getBookByNO(no);
	}

	public boolean isBookExists(String title, String writer, String publisher) {
		return bookDao.isBookExists(title, writer, publisher);
	}

	public void rentBook(BookVO book) {
		bookDao.rentBook(book);
	}

	public void returnBook(BookVO book) {
		bookDao.returnBook(book);
	}

}