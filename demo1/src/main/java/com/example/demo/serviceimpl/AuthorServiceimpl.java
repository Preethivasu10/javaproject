package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AuthorDto;
import com.example.demo.modal.Author;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.service.AuthorService;
@Service
public  class AuthorServiceimpl implements AuthorService {


	@Autowired
    private AuthorRepository authorRepository;
    
    @Override
    public boolean saveOrUpdate(AuthorDto authorDto) {
        Author auuthor = new Author();
        auuthor.setAid(authorDto.getAid());
        auuthor.setAge(authorDto.getAname());
        auuthor.setAge(authorDto.getAge());
        auuthor.setGender(authorDto.getGender());
        auuthor.setSpecialization(authorDto.getSpecialization());
        // Set other properties as needed
        
        authorRepository.save(auuthor);
        return true;
    }
   
//	public List<Doctor> getAllDoctor() {
//		List<Doctor> product=doctorRepository.findAll();
//		return product;
//	}
    @Override
    public List<Author> getAllAuthor(){
    	List<Author> product=authorRepository.findAll();
		return product;
    	
    }

}
