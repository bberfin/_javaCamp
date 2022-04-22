package Business.concretes;

import Business.abstracts.UserCheckService;
import Business.abstracts.UserService;
import Business.abstracts.VerificationService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService {

    UserCheckService userCheckService;
    VerificationService mailVerificationService;
    UserDao userDao;

    

    public UserManager(UserCheckService userCheckService, VerificationService mailVerificationService, UserDao userDao) {
        this.userCheckService = userCheckService;
        this.mailVerificationService = mailVerificationService;
        this.userDao = userDao;
    }

    @Override
    public void signUp(User user) {
        if(userCheckService.isValid(user)==true){
            System.out.println(user.getFirstName()+" signed up to the system successfully.");
            mailVerificationService.sendToVerifyMail(user.getEmail());
            userDao.add(user);
        }
        
    }

    @Override
    public void signIn(User user) {
        mailVerificationService.sendToVerifyMail(user.getEmail());
        if(userDao.getEmail(user.getEmail()) && userDao.getPassword(user.getPassword()) && mailVerificationService.checkVerifyAccount(user.getEmail()) == true){
            System.out.println(user.getFirstName()+" signed in to the system successfully.");
        }
        else if (mailVerificationService.checkVerifyAccount(user.getEmail())== false){
            System.out.println("the e-mail address is not verified.");
        }
        else{
            System.out.println("User information is incorrect, please check.");
        }
        
    }

    
}
