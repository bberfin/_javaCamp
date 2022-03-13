public class StudentManager extends UserManager{

	public 	void addCourse(Student student,String course) {
		System.out.println(student.getStudentNo()+"-"+student.getFirstName()+"<----"+course);
	}	
	
	@Override
	public void information(User user) {
		System.out.println("-----------------student information----------------------------");		
		System.out.println("Student id    : "+user.getId());		
		System.out.println("Student email : "+user.getEmail());		
		System.out.println("----------------------------------------------------------------");				

	}
	

}
