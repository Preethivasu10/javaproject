package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dto.AuthorDto;
import com.example.demo.modal.Author;
import com.example.demo.service.AuthorService;

@RestController
public class AuthorController {

    @Autowired
   AuthorService authorService;

    @PostMapping("/registerauthor")
    public boolean saveOrUpdate(@RequestBody AuthorDto dto) {
        return authorService.saveOrUpdate(dto);
    }

//	@GetMapping("/getAllAuthor") 
//	public List<Author>getAllAuthor() {
//		
//	
//	
//		 return authorService.getAllAuthor();
//		  
//		  
//    }
//	@GetMapping("/getAllauthor") 
 
    @GetMapping("/getAllauthor") 
	 public List<Author> getAllAuthor(){
		 return authorService.getAllAuthor();
		 
    }
		 
    }
	