package com.crudoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudoperation.Repo.StudentRepo;
import com.crudoperation.student.student;

@Service
public class serviceimpl implements service {
	@Autowired
	private StudentRepo repo;

	@Override
	public boolean addstudent(student std) {
		boolean status =false;
		try {
			repo.save(std); 
			status=true;
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			status =false;
		}
		
		
		return status ;
	}
	@Override
	public List<student> getallstudent() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public student getstudent(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}
	@Override
	public boolean updateStudent(long id, float marks) {
		// TODO Auto-generated method stub
		
		student stude= getstudent(id);
		if(stude != null) {
			stude.setMarks(marks);
			repo.save(stude);
			return true;
		}
		
		
		
		return false;
	}
	@Override
	public boolean deletestudent(long id) {
		// TODO Auto-generated method stub
		boolean status =false;
		try {
			repo.deleteById(id);
			status =true;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			status=false;
		}
		return status;
	}



}
