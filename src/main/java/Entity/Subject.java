package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SUBJECT")
public class Subject {
	
	@Id
	@GeneratedValue
	@Column(name = "SUBJECT_ID")
	private String subjectId;
	@Column(name = "SUBJECT_NAME")
	private String subjectName;
	
}
