package com.crudoperation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudoperation.student.student;
@Repository
public interface StudentRepo extends JpaRepository<student,Long> {

}
