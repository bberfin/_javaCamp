package Business.concretes;

import java.util.ArrayList;
import java.util.List;

import Business.abstracts.VerificationService;

public class MailVerificationManager implements VerificationService {


    UserCheckManager userCheckManager;

	List<String> verificatedEmails = new ArrayList<String>();

    @Override
    public void sendToVerifyMail(String email) {
        System.out.println("A confirmation email has been sent to "+email);
    }

    @Override
    public void verifyMail(String email) {
        verificatedEmails.add(email);
		System.out.println(email + " : mail has been successfully verified");
        
    }

    @Override
    public boolean checkVerifyAccount(String email) {
        if (verificatedEmails.contains(email)) {
			return true;
		}
        return false;
    }
    
}
