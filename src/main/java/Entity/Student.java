package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	private String studentId;
	@Column(name = "STUDENT_NAME")
	private String studentName;
	@Column(name = "SUBJECT_ID")
	private String subjectId;
	@Column(name = "SEMESTER_ID")
	private String semesterId;

}
