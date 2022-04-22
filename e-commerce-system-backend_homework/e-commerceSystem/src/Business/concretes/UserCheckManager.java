package Business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import Business.abstracts.UserCheckService;
import Entities.concretes.User;

public class UserCheckManager implements UserCheckService{

    List<String> listOfEmail = new ArrayList<>();

    @Override
    public boolean checkFirstName(User user) {
        if(user.getFirstName().isEmpty()){
            System.out.println("Name field cannot be left blank.");
            return false;
        }
        else if(user.getFirstName().length()<2){
                System.out.println("Name cannot be less than 2 characters.");
                return false;
        }
        return true;
    }

    @Override
    public boolean checkLastName(User user) {
        if(user.getlastName().isEmpty()){
            System.out.println("Name field cannot be left blank.");
            return false;
        }
        else if(user.getlastName().length()<2){
                System.out.println("Name cannot be less than 2 characters.");
                return false;
        }
        return true;
    }

    @Override
    public boolean checkPassword(User user) {
        if(user.getPassword().isEmpty()){
            System.out.println("Password field cannot be left blank.");
            return false;
        }
        else if (user.getPassword().length()<6){
            System.out.println("Password cannot be less than 6 characters.");
            return false;
        }
        return true;
    }

    @Override
    public boolean checkEmail(User user) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		if (user.getEmail().isEmpty()) {
			System.out.println("E-mail field cannot be left blank.");
			return false;
		} 
        else if (pattern.matcher(user.getEmail()).find() == false) {
				System.out.println("The entered email address is not suitable for the format. Example: example@example.com");
				return false;
		}
		return true;
    }

    @Override
    public boolean isEmailUnique(User user) {
        if(listOfEmail.contains(user.getEmail())){
            System.out.println("This e-mail address has already been registered in the system. Try a different e-mail address.");
            return false;
        }
        else{
            listOfEmail.add(user.getEmail());
            return true;
        }
    }

    @Override
    public boolean isValid(User user) {
        if(checkFirstName(user) && checkLastName(user) && checkEmail(user) && checkPassword(user) && isEmailUnique(user) == true){
            return true;
        }
        return false;
    }
    
}
