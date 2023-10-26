package com.example.demo.controller;


import java.util.List;

//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ReaderDto;

import com.example.demo.modal.Reader;
import com.example.demo.service.ReaderService;

@RestController
public class ReaderController {

    @Autowired
    private ReaderService readerService;

    @PostMapping("/registerreader")
    public boolean saveOrUpdate(@RequestBody ReaderDto dto) {
        return readerService.saveOrUpdate(dto);
    }

//    @GetMapping("/getAllReader")
//    public List<Reader> getAllReader() {
//        return readerService.getAllReader();
//    }List<Reader> product=readerRepository.findAll();
    @GetMapping("/getallreader") 
	 public List<Reader> getAllReader(){
		 return readerService.getAllReader();
		 
   }
    
}
