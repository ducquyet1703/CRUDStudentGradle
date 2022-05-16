package com.example.crudstudentgradle.service;

import com.example.crudstudentgradle.entity.Student;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface StudentService {
	List<Student> getAllStudent(Sort sort);
	Student createStudent(Student student);
	Student updateStudent(Long id, Student student);
	void deleteStudent(Long id);
}
