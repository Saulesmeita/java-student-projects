package lv.javaguru.lesson11.userservice;

public class UserService {

    UserRepository userDB = new UserRepository();

    public void addUser(User user) {
        if (user.getName().length() >= 3 && user.getName().length() <= 15) {
            if (user.getAge() > 0 && user.getAge() <= 120) {
                userDB.save(user);
            }
        }
    }
}
