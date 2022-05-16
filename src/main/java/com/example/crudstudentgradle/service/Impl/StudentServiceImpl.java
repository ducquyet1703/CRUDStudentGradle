package com.example.crudstudentgradle.service.Impl;

import com.example.crudstudentgradle.entity.Student;
import com.example.crudstudentgradle.repository.StudentRepository;
import com.example.crudstudentgradle.service.StudentService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {this.studentRepository = studentRepository;}


	@Override
	public List<Student> getAllStudent(Sort sort) {
		sort = Sort.by("id");
		return studentRepository.findAll(sort);
	}

	@Override
	public  Student createStudent(Student student){
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Long id, Student student) {
		Student findId = studentRepository.findById(id).orElse(null);
		if(findId == null){
			return null;
		}
		findId.setName(student.getName());
		findId.setClass_name(student.getClass_name());
		findId.setBirth(student.getBirth());
		findId.setScore(student.getScore());
		return studentRepository.save(findId);
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}

}
