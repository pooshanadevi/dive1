package com.testdao;

import java.sql.SQLException;

import jdbctamplate.Book1;

public class TestDao {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		TestDao dao = new TestDao();

		Book1 book = new Book1();

		book.setIsbn(103);
		book.setTitle("Java");
		book.setAuthor("gfsd");
		book.setPublishdate("14-mar-17");
		book.setContent("hiwehfybhceb");
		book.setPrice(450);	
		book.setStatus("draft");

		dao.add(book);
		// dao.modify(employee);

		// dao.remove(101);
		dao.listAll();

	}

	private void add(Book1 book) {
		// TODO Auto-generated method stub
		
	}

	private void listAll(){
	// TODO Auto-generated method stub
	
	}
}
