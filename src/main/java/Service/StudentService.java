package Service;

import Entity.Marksheet;
import Entity.Semesters;
import Entity.Student;
import Entity.Subject;
import Request.MarksRequest;

public interface StudentService {

	Student addStudent(Student student);

	Subject addSubject(Subject subject);

	Semesters addSemester(Semesters semester);

	Marksheet addMarks(MarksRequest marksheet);
	
	

}
