/**
 *Author : OMKAR SHIVADEKAR
 *Document : StudentDAOImpl.java
 *Date : 06-Jun-2018
 *Time : 11:50:18 PM 
 */
package com.omkarsh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	/*injecting session factory (DI)*/
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Student> getStudentDetails() {
		
		//get the current hibernate session
		Session session = sessionFactory.getCurrentSession();
		
		//create a query
		Query<Student> theQuery = session.createQuery("from Student",Student.class);
		
		//execute query and get result list
		List<Student> students = theQuery.getResultList();
		
		//return the results
		return students;
	}

	@Override
	public List getToppers(String city, String age) {
		
		String colAge [] = age.split("-");
		
		int startAge = Integer.parseInt(colAge[0]);
		
		int endAge = Integer.parseInt(colAge[1]);
		
		//System.out.println(startAge+" "+endAge);
		
		//get the current hibernate session
		Session session = sessionFactory.getCurrentSession();
		
		//create a query
		Query<Student> theQuery = session.createQuery("from Student where age BETWEEN ? AND ? AND city=? ORDER BY marks DESC",Student.class);
				
		theQuery.setParameter(0, startAge);
		
		theQuery.setParameter(1, endAge);
		
		theQuery.setParameter(2, city);
				
		theQuery.setMaxResults(5);
		
		List toppers=theQuery.getResultList();
		
		//System.out.println(toppers.toString());
		
		return toppers;
	}

}
