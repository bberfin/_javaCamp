
import Business.concretes.MailVerificationManager;
import Business.concretes.UserCheckManager;
import Business.concretes.UserManager;
import DataAccess.concretes.HibernateUserDao;
import Entities.concretes.User;

public class Main{
    public static void main(String[] args)  {
        User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Berfin");
		user1.setLastName("Açıkgöz");
		user1.setEmail("berfinacikgoz@hotmail.com");
		user1.setPassword("123456");
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Yigit");
		user2.setLastName("Tasdemir");
		user2.setEmail("yigittasdemir@hotmail.com");
		user2.setPassword("123456");
		
		User user3 = new User();
		user3.setId(3);
		user3.setFirstName("Emre");
		user3.setLastName("Inan");
		user3.setEmail("emreinan@hotmail.com");
		user3.setPassword("123456");

		UserManager userManager = new UserManager(new UserCheckManager(),new MailVerificationManager(),new HibernateUserDao());
		
		userManager.signUp(user1);
		userManager.signUp(user2); 
		userManager.signIn(user3);  
    }
}
