package com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.StudentDetails;

@Controller
public class StudentController {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Abhishek");
	
	
	
	@RequestMapping("/reg")
	public String insert()
	{
		return "register";
	}
	
	
	@RequestMapping("/save")
	public String save(StudentDetails s) 
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(s);
		et.commit();
		return "save";

		
	}
	
	

}
