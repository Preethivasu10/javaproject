package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.AuthorRepository;
@Service
public class MergedService {
	@Autowired
    private AuthorRepository authorRepository;
	public List<Object[]> getMergedData(){
		return authorRepository.mergeAuthorAndReaderData();
	}
}
//@Autowired
//private PatientRepository patientRepository;
//
//public List<Object[]> getMergedData() {
//    return patientRepository.mergePatientAndDoctorData();
//