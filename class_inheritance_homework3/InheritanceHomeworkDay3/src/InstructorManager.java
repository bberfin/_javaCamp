public class InstructorManager extends UserManager {
	
	public 	void addField(Instructor instructor,String field) {
		System.out.println(instructor.getFirstName()+"<----"+field);
	}
	
	@Override	
	public void information(User user) {
		System.out.println("------------instructor information---------------------------------");		
		System.out.println("instructor id    : "+user.getId());		
		System.out.println("instructor email : "+user.getEmail());
		System.out.println("-------------------------------------------------------------------");				
	}
	
}