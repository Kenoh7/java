package com.kenoh.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenoh.bookclub.models.Book;
import com.kenoh.bookclub.repositories.BookRepository;

@Service
public class MainService {

	@Autowired
	private BookRepository bookRepo;

//	FIND ALL BOOKS
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}
	
//	FIND A BOOK
	public Book findOneBook(Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		}else {
			return null;
		}
	}
	
//	CREATE A BOOK
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
	
//	UPDATE BOOK
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}
	
//  DELETE BOOK
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
}
