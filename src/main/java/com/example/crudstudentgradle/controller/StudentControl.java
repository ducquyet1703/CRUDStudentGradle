package com.example.crudstudentgradle.controller;

import com.example.crudstudentgradle.entity.Student;
import com.example.crudstudentgradle.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentControl {
	private final StudentService studentService;

	public StudentControl(StudentService studentService) {this.studentService = studentService;}

	// Get All Student
	@ApiOperation(value = "1: Lấy danh sách tất cả học sinh")
	@GetMapping("/getAll")
	public List<Student> AllStudent(Sort sort){
		return  studentService.getAllStudent(sort);
	}
	// Create Student
	@ApiOperation(value = "2: Tạo thông tin một học sinh")
	@PostMapping("/createStudent")
	public Student createStu(@RequestBody Student student){
		return studentService.createStudent(student);
	}
	// Update Student
	@ApiOperation(value = "3: Cập nhập thông tin học sinh")
	@PutMapping("/updateStudent")
	public Student updateStu(@RequestParam Long id, @RequestBody Student student){
		return studentService.updateStudent(id, student);
	}
	// Delete Student
	@ApiOperation(value = "4: Xoá thông tin một học sinh")
	@DeleteMapping("/deleteStudent")
	public void deleteStu(@RequestParam Long id){
		studentService.deleteStudent(id);
	}

}
