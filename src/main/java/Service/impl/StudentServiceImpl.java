package Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Marksheet;
import Entity.Semesters;
import Entity.Student;
import Entity.Subject;
import Repository.MarksheetRepository;
import Repository.SemestersRepository;
import Repository.StudentRepository;
import Repository.SubjectRepository;
import Request.MarksRequest;
import Service.StudentService;



@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	SubjectRepository subjectRepository;
	
	@Autowired
	SemestersRepository semestersRepository;
	
	@Autowired
	MarksheetRepository marksheetRepository;

	@Override
	public Student addStudent(Student student) {
		
		studentRepository.save(student);	
		
		return student;
	}

	@Override
	public Subject addSubject(Subject subject) {
		
		subjectRepository.save(subject);
		
		return subject;
	}

	@Override
	public Semesters addSemester(Semesters semester) {
		
		semestersRepository.save(semester);
		
		return semester;
	}

	@Override
	public Marksheet addMarks(MarksRequest marksheet) {
		
		
		
		return null;
	}
	
	

}
