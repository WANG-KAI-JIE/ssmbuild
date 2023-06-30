package top.kjwang.dao;

import org.apache.ibatis.annotations.Param;
import top.kjwang.pojo.Books;

import java.util.List;

/**
 * @author kjwang
 * @date 2023/6/30 17:10
 * @description BookMapper
 */
public interface BookMapper {
//	增加一本书
	int addBook(Books books);
//	删除一本书
	 int deleteBookById(int id);
//	更新一本书
	int updateBook(Books books);
//	查询一本书
	Books queryBookById(int id);
//	查询所有书
	List<Books> queryAllBook();
}

