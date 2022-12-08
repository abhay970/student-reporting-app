package Request;

public class MarksRequest {
	
	private String SudentId;
	
	private String subjectId;
	
	private String semesterId;
	
	private int marks;

	public MarksRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSudentId() {
		return SudentId;
	}

	public void setSudentId(String sudentId) {
		SudentId = sudentId;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(String semesterId) {
		this.semesterId = semesterId;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
