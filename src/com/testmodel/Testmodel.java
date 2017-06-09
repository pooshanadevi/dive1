package com.testmodel;

import jdbctamplate.Book1;

public class Testmodel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book1 book = new Book1();

		
		book.setIsbn(103);
		book.setTitle("Java");
		book.setAuthor("gfsd");
		book.setPublishdate("14-mar-17");
		book.setContent("hiwehfybhceb");
		book.setPrice(450);	
		book.setStatus("draft");

		// System.out.println(employee.getId());
		// System.out.println(employee.getName());

		System.out.println(book);
	}
}
