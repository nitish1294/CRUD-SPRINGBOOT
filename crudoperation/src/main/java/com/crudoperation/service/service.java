package com.crudoperation.service;

import java.util.List;

import com.crudoperation.student.student;

public interface service {
	public boolean addstudent(student std);
	public List<student> getallstudent();
	public student getstudent(long id);
	public boolean updateStudent(long id,float marks);
	public boolean deletestudent(long id);
	
}
