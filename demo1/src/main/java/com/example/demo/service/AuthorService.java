package com.example.demo.service;



import java.util.List;


import com.example.demo.dto.AuthorDto;
import com.example.demo.modal.Author;


public interface AuthorService {
  
  
	
	//List<Author> getAllAuthor();
	boolean saveOrUpdate(AuthorDto dto);

	public List<Author> getAllAuthor();
	
  

    // You can define more methods as needed for your author-related operations
}
