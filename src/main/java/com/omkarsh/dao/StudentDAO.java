/**
 *Author : OMKAR SHIVADEKAR
 *Document : StudentDAO.java
 *Date : 06-Jun-2018
 *Time : 11:47:51 PM 
 */
package com.omkarsh.dao;

import java.util.List;

import com.entity.Student;

public interface StudentDAO {
	
	public List<Student> getStudentDetails();
	
	public List getToppers(String city,String age);

}
