package lv.javaguru.lesson4;

public class UserLoginService {

    public boolean login(User user, String password) {

        if (!user.isBlocked()) {
            if (user.getPassword().equals(password)) {
                user.restoreTries();
                return true;
            } else {
                if (user.getTriesLeft() > 1) {
                    user.decrementTriesLeft();
                } else {
                    user.blockUser();
                    warningUserIsBlocked(user);
                }
                return false;
            }

        } else {
            warningUserIsBlocked(user);
            return false;
        }
    }

    private void warningUserIsBlocked(User user) {
        System.out.println("The user " + user.getLogin() + " is blocked");
    }
}
