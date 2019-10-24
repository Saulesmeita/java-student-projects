package lv.javaguru.lesson4;

public class UserLoginServiceDemo {

    public static void main(String[] args) {

        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password");

        boolean loginResult = service.login(userOne, "user-password12345");
        System.out.println("Login result = " + loginResult);

        loginResult = service.login(userOne, "user-password");
        System.out.println("Login result = " + loginResult);

        loginResult = service.login(userOne, "user-password1");
        System.out.println("Login result = " + loginResult);

        loginResult = service.login(userOne, "user-password2");
        System.out.println("Login result = " + loginResult);

        loginResult = service.login(userOne, "user-password3");
        System.out.println("Login result = " + loginResult);

    }
}
