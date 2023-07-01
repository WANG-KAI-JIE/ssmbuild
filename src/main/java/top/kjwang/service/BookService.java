package top.kjwang.service;

import org.apache.ibatis.annotations.Param;
import top.kjwang.pojo.Books;

import java.util.List;

/**
 * @author kjwang
 * @date 2023/6/30 17:31
 * @description BookService
 */
//BookService:底下需要去实现,调用dao层
public interface BookService {
	//增加一个Book
	int addBook(Books book);
	//根据id删除一个Book
	int deleteBookById(@Param("bookID") int id);
	//更新Book
	int updateBook(Books books);
	//根据id查询,返回一个Book
	Books queryBookById(@Param("bookID") int id);
	//查询全部Book,返回list集合
	List<Books> queryAllBook();
	//	根据书名查询书
	Books queryBookByName(@Param("bookName")String bookName);
}