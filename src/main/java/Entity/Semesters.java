package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SEMESTER")
public class Semesters {

	@Id
	@GeneratedValue
	@Column(name = "SEMESTER_ID")
	private String semesterId;
	@Column(name = "SEMESTER_NAME")
	private String semesterName;
	public Semesters() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(String semesterId) {
		this.semesterId = semesterId;
	}
	public String getSemesterName() {
		return semesterName;
	}
	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}
}
