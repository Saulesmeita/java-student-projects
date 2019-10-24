package lv.javaguru.lesson4;

public class User {

    String login;
    private String password;
    private boolean isBlocked = false;

    final int DEFAULT_TRIES = 3;
    private int triesLeft = DEFAULT_TRIES;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public int getTriesLeft() {
        return triesLeft;
    }

    public void decrementTriesLeft() {

        this.triesLeft--;
        System.out.println("You have " + triesLeft + " tries left");
    }

    public String getLogin() {
        return login;
    }

    public void restoreTries() {

        triesLeft = DEFAULT_TRIES;
    }

    public void blockUser() {

        isBlocked = true;
    }

    public void unblockUser() {

        isBlocked = false;

    }


}
