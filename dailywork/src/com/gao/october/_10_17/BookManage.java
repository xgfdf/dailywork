package com.gao.october._10_17;
//图书管理类

import java.util.HashMap;
import java.util.Map;

public class BookManage {
	static Map<String, Book> map = new HashMap<>();
	
	//添加图书
	public static boolean add(Book book) {
		int beforeLen = map.size();
		map.put(book.getId(), book);
		int afterLen = map.size();
		if (beforeLen != afterLen) {
			return true;
		}
		return false;
	}
	
	//更新图书
	public static boolean update(Book book) {
		//判断图书是否存在
		boolean has = map.containsKey(book.getId());
		
		if (has) {
			map.put(book.getId(), book);
			return true;
		}
		return false;
	}
	
	//查询图书
	public static Book query(String id) {
		return map.get(id);
	}
	
	public static void query2(String id) {
		Book b = map.get(id);
		System.out.println(b.toString());
	}
	
	//删除
	public static boolean delete(String id) {
		Book b = map.remove(id);
		if(b != null) {//删除成功
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Book b1 = new Book("b001", "杀死一个程序员", 20.00);
		Book b2 = new Book("b002", "西游记", 25.00);
		Book b5 = new Book("b005","生死疲劳",15);

		//添加图书
		add(b1);
		add(b2);
		add(b5);
		
		//修改图书
		update(new Book("b001", "杀死一群程序员", 100.00));
		
		//查询
		Book b = query("b002");
		System.out.println(b);
		
		//删除
		delete("b002");
		
		System.out.println(map);
		
	}
}
