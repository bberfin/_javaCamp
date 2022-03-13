public class UserManager {
	
	public void add(User user) {
		System.out.println("User "+user.getId()+" added");
	}

	public void delete(User user) {
		System.out.println("User "+user.getId()+" deleted");
	}
	
	public void information(User user) {
		System.out.println("------------information---------------------------------");		
		System.out.println("User id    : "+user.getId());		
		System.out.println("User email : "+user.getEmail());
		System.out.println("--------------------------------------------------------");				
	}	
	
	
}
