package com.example.demo.service;


import java.util.List;

import com.example.demo.dto.ReaderDto;

import com.example.demo.modal.Reader;



public interface ReaderService {
    boolean saveOrUpdate(ReaderDto dto);

	//List<Reader> getAllReader();

  
    public List<Reader> getAllReader();
    // You can define more methods as needed for your reader-related operations
}
