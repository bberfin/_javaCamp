public class Student extends User {
	
	
	private String FirstName;
	private String LastName;	
	private int StudentNo;
	boolean isGettingEducation;
	

	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}	
		
	public int getStudentNo() {
		
		return StudentNo;
		
	}

	public void setStudentNo(int studentNo) {
		StudentNo = studentNo;
	}

	public boolean isGettingEducation() {
		return isGettingEducation;
	}

	public void setGettingEducation(boolean isGettingEducation) {
		this.isGettingEducation = isGettingEducation;
	}
	

}