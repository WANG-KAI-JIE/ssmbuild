package top.kjwang.service;

import top.kjwang.dao.BookMapper;
import top.kjwang.pojo.Books;

import java.util.List;

/**
 * @author kjwang
 * @date 2023/6/30 17:32
 * @description BookServiceImpl
 */
public class BookServiceImpl implements BookService {

	//调用dao层的操作，设置一个set接口，方便Spring管理
	private BookMapper bookMapper;

	public void setBookMapper(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

	public int addBook(Books book) {
		return bookMapper.addBook(book);
	}

	public int deleteBookById(int id) {
		return bookMapper.deleteBookById(id);
	}

	public int updateBook(Books books) {
		return bookMapper.updateBook(books);
	}

	public Books queryBookById(int id) {
		return bookMapper.queryBookById(id);
	}

	public List<Books> queryAllBook() {
		return bookMapper.queryAllBook();
	}

	@Override
	public Books queryBookByName(String bookName) {
		return bookMapper.queryBookByName(bookName);
	}
}