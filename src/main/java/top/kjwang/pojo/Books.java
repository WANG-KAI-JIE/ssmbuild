package top.kjwang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kjwang
 * @date 2023/6/30 17:06
 * @description Books
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
	private int bookID;
	private String bookName;
	private int bookCounts;
	private String detail;
}
