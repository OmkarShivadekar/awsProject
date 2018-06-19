/**
 *Author : OMKAR SHIVADEKAR
 *Document : StudentServiceImpl.java
 *Date : 06-Jun-2018
 *Time : 11:41:56 PM 
 */
package com.omkarsh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.omkarsh.dao.StudentDAO;
import com.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	@Transactional
	public List<Student> getStudents() {
	
		return studentDAO.getStudentDetails();
	}

	@Override
	@Transactional
	public List getTogetTopper(String city, String age) {

		return studentDAO.getToppers(city,age);
	}

}
