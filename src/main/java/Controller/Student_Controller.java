package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.Marksheet;
import Entity.Semesters;
import Entity.Student;
import Entity.Subject;
import Request.MarksRequest;
import Service.StudentService;

@RestController
@RequestMapping("/student")
public class Student_Controller {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/add")
	public Student addStudent(Student student) {
		
		return studentService.addStudent(student);
	}
	
	@PostMapping("/add/subject")
	public Subject addSubject(Subject subject) {
		
		return studentService.addSubject(subject);
	}
	
	@PostMapping("/add/semester")
	public Semesters addSemester(Semesters semester) {
		
		return studentService.addSemester(semester);
	}
	
	@PostMapping("/add/marks")
	public Marksheet addMarks(MarksRequest marksheet) {
		
		return studentService.addMarks(marksheet);
	}

}
