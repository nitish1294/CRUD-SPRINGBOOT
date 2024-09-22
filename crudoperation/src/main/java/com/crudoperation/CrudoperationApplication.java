package com.crudoperation;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.crudoperation.service.service;
import com.crudoperation.service.serviceimpl;
import com.crudoperation.student.student;

@SpringBootApplication
public class CrudoperationApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(CrudoperationApplication.class, args);
		serviceimpl src= context.getBean(serviceimpl.class);
		
		
		
		
//		<---------------Insert operation--------------->
//		student src1=new student();
//		src1.setName("shrey");
//		src1.setRollno(4);
//		src1.setMarks(70.10f);
//		
//		boolean status= src.addstudent(src1); 
//		if(status) {
//			System.out.println("Student Inserted successfully");
//		}
//		else {
//			System.out.println("student not inserted dua to same error.");
//		}
		
		
		
		
		
//		<---------------fetch Data--------------->
//		List<student> std=src.getallstudent();
//		for(student stu : std) {
//			System.out.println("ID : "+stu.getId());
//			System.out.println("Name : "+stu.getName());
//			System.out.println("Roll No.: "+stu.getRollno());
//			System.out.println("Marks: "+stu.getMarks());
//			System.out.println("<---*---*---*---*---*---*---*---*---*---*---*---*---*---*---*---*---*--->");
//		}
		
		
		
		
		
//		
//		<---------------single data operation--------------->
//		student stude= src.getstudent(7l);
//		if (stude !=null) {
//			long id=stude.getId();
//			String name=stude.getName();
//			int rollno =stude.getRollno();
//			float mark=stude.getMarks();
//			System.out.println("Id :"+id+" Name : "+ name+" Rollno : "+rollno+" Marks : "+mark);
//			
//		} else {
//			System.out.println("user not found");
//			
//		}
		
		
		
		
		
//		<---------------Update user operation--------------->
//		boolean status=src.updateStudent(2l, 80.7f);
//		if(status) {
//			System.out.println("updated");
//		}
//		else {
//			System.out.println("not update");
//		}
		
		
		
		
		
////		<---------------Delete user operation--------------->
//		boolean status=src.deletestudent(1l);
//		if (status) {
//			System.out.println("Deleted successfully");
//			
//		} else {
//			System.out.println("not deleted");
//
//		}
//		
//		
		
		
		
		
		
		
	}

}
