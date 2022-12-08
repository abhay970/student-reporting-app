package Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MARKSHEET")
public class Marksheet {

	@Id
	@GeneratedValue
	@Column(name = "MARKSHEET_ID")
	private String marksheetId;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "STUDENT_ID")
	private Student studentId;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "SUBJECT_ID")
	private Subject subjectId;
	

	public Marksheet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMarksheetId() {
		return marksheetId;
	}

	public void setMarksheetId(String marksheetId) {
		this.marksheetId = marksheetId;
	}

	public Student getStudentId() {
		return studentId;
	}

	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}

	public Subject getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Subject subjectId) {
		this.subjectId = subjectId;
	}

	public Semesters getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(Semesters semesterId) {
		this.semesterId = semesterId;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "SEMESTER_ID")
	private Semesters semesterId;
	
	@Column(name = "MARKS")
	private int marks;
}
