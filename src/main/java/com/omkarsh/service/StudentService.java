/**
 *Author : OMKAR SHIVADEKAR
 *Document : StudentService.java
 *Date : 06-Jun-2018
 *Time : 11:38:54 PM 
 */
package com.omkarsh.service;

import java.util.List;

import com.entity.Student;

public interface StudentService {

	public List<Student> getStudents();
	
	public List getTogetTopper(String city,String age);
}
