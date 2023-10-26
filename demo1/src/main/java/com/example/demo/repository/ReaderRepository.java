package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.modal.Reader;


public interface ReaderRepository extends JpaRepository<Reader, Integer> {
    
//    @Query(nativeQuery = true, value = "SELECT readerId, name, age, gender FROM reader " +
//            "UNION " +
//            "SELECT id, name, age, gender FROM author")
//    List<Object[]> mergeReaderAndAuthorData();
//    
//    // You can add more custom queries as needed for your application
//	@Query(nativeQuery = true, value = "SELECT aid, name, age, gender, specialization FROM author " +
//	        "UNION " +
//	        "SELECT readerId, name, age, gender FROM reader")
//	List<Object[]> mergeAuthorAndReaderData();
	@Query(nativeQuery = true, value = "SELECT aid, aname, age, gender,specialization FROM author " +
	        "UNION " +
	        "SELECT rid, rname,age,gender, phone  FROM reader")
	List<Object[]> mergeAuthorAndReaderData();
}