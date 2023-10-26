package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.example.demo.modal.Author;



public interface AuthorRepository extends JpaRepository< Author, Integer> {
    
   
//    @Query("SELECT a FROM Author a WHERE a.specialization = :specialization")
//    List<Author> findAuthorsBySpecialization(@Param("specialization") String specialization);
//
//	
//    Author findById(int id);
//	@Query(nativeQuery = true, value = "SELECT aid, name, age, gender, specialization FROM author " +
//	        "UNION " +
//	        "SELECT readerId, name, age, gender FROM reader")
//	List<Object[]> mergeAuthorAndReaderData();
	
	@Query(nativeQuery = true, value = "SELECT aid, aname, age, gender,specialization FROM author " +
	        "UNION " +
	        "SELECT rid, rname,age,gender, phone  FROM reader")
	List<Object[]> mergeAuthorAndReaderData();
}