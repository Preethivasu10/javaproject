package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ReaderDto;

import com.example.demo.modal.Reader;
import com.example.demo.repository.ReaderRepository;
import com.example.demo.service.ReaderService;

@Service
public class ReaderServiceImpl implements ReaderService {

	@Autowired
    private ReaderRepository readerRepository;
    
    @Override
    public boolean saveOrUpdate(ReaderDto readerDto) {
        Reader reeader = new Reader();
        reeader.setRid(readerDto.getRid());
        reeader.setRname(readerDto.getRname());
        reeader.setAge(readerDto.getAge());
        reeader.setGender(readerDto.getGender());
        reeader.setPhone(readerDto.getPhone());
        
        readerRepository.save(reeader);
        return true;
    }
    @Override
    public List<Reader> getAllReader(){
    	List<Reader> product=readerRepository.findAll();
		return product;
    }
    
    // You can add more methods as needed for your reader-related operations
}
