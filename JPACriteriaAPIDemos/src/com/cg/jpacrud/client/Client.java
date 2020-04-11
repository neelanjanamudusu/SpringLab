package com.cg.jpacrud.client;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.cg.jpacrud.entities.Book;

public class Client {

	public static void main(String[] args) {

	Book book= new Book();
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em= emf.createEntityManager();
	CriteriaBuilder cb= em.getCriteriaBuilder();
	CriteriaQuery<Book> cq=cb.createQuery(Book.class);  
	Root<Book> stud=cq.from(Book.class);
	// for displaying list of books in ascending order 
	 //cq.orderBy(cb.asc(stud.get("title")));  
	
	//for sorting records in descending order of price
    //cq.orderBy(cb.desc(stud.get("price")));
    
	//book list where price is greater than 500
//	cq.where(cb.greaterThan(stud.get("price"),500));
	
	CriteriaQuery<Book> select = cq.select(stud);  
     TypedQuery<Book> q = em.createQuery(select);  
     List<Book> list = q.getResultList();
     for(Book b: list) {
     System.out.println(b.getTitle()+" "+b.getId()+" "+b.getPrice());
     }
     em.close();
	emf.close();
		}
	
}
