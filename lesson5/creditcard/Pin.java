package lv.javaguru.lesson5.creditcard;

public class Pin {

    private String pin;
    private final int MAX_TRIES = 3;
    private final int MIN_TRIES = 0;
    private int triesLeft = MAX_TRIES;


    public Pin(String pin) {
        this.pin = pin;
    }

    public boolean checkPin (String somePin) {
        if (this.pin.equals(somePin)) {
            resetTries();
            return true;
        } else {
            decrementTriesLeft();
            return false;
        }
    }

    public void resetTries() {
        if (this.triesLeft < MAX_TRIES) {
            this.triesLeft = MAX_TRIES;
        }
    }

    public void decrementTriesLeft() {
        warningIncorrectPin();
        if (this.triesLeft > MIN_TRIES) {
            this.triesLeft--;
        }
        warningTriesLeft();
    }

    public void warningIncorrectPin() {
        System.out.println("You have entered incorrect pin.");
    }

    public void warningTriesLeft() {
        System.out.println("You have " + triesLeft + " tries left");
    }
}
