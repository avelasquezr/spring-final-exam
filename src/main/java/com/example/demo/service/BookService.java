package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
	public void saveBook(Book movie) {
		bookRepository.save(movie);
	}
	
	public Book getBookByID(Long id) {
		return bookRepository.findById(id).orElse(null);
	}
	
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
	
}
