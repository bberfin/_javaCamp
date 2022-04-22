package Business.abstracts;

import Entities.concretes.User;

public interface UserService {
    void signUp(User user);
    void signIn(User user);
}
