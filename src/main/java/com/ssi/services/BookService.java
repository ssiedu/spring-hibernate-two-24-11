package com.ssi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssi.dao.BookDAO;
import com.ssi.entities.Book;

@Service
public class BookService {

	@Autowired
	private BookDAO bookDAO;
	
	public Book addNewBook(Book book) {
		//it will use DAO to save book
		bookDAO.saveBook(book);
		return book;
	}
	
	
}
