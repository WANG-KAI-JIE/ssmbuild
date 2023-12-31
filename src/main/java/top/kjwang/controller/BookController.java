package top.kjwang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import top.kjwang.pojo.Books;
import top.kjwang.service.BookService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kjwang
 * @date 2023/6/30 21:20
 * @description BookController
 */

@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	@Qualifier("BookServiceImpl")
	private BookService bookService;
	@RequestMapping("/allBook")
	public String list(Model model) {
		List<Books> list = bookService.queryAllBook();
		model.addAttribute("list", list);
		return "allBook";
	}
	@RequestMapping("/toAddBook")
	public String toAddPaper() {
		return "addBook";
	}
	@RequestMapping("/addBook")
	public String addPaper(Books books) {
		System.out.println(books);
		bookService.addBook(books);
		return "redirect:/book/allBook";
	}
	@RequestMapping("/toUpdateBook")
	public String toUpdateBook(Model model, int id) {
		Books books = bookService.queryBookById(id);
		System.out.println(books);
		model.addAttribute("book",books );
		return "updateBook";
	}
	@RequestMapping("/updateBook")
	public String updateBook(Model model, Books book) {
		System.out.println(book);
		bookService.updateBook(book);
		Books books = bookService.queryBookById(book.getBookID());
		model.addAttribute("books", books);
		return "redirect:/book/allBook";
	}
	@RequestMapping("/del/{bookId}")
	public String deleteBook(@PathVariable("bookId") int id) {
		bookService.deleteBookById(id);
		return "redirect:/book/allBook";
	}
	@RequestMapping("/queryBook")
	public String queryBook(String queryBookName,Model model) {
		Books books = bookService.queryBookByName(queryBookName);

		System.err.println("books=>"+books);
		List<Books> list = new ArrayList<Books>();
		list.add(books);
		if(books == null){
			list = bookService.queryAllBook();
			model.addAttribute("error","未查到");
		}
		model.addAttribute("list", list);
		return "allBook";
	}
}