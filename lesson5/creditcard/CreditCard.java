package lv.javaguru.lesson5.creditcard;

public class CreditCard {

    private String cardNumber;
    private Pin pin;
    private double balance;
    private double creditLimit;
    private double creditDebt;

    public double availableAmount() {
        return this.balance + this.creditLimit - this.creditDebt;
    }

    public CreditCard(String cardNumber, String pin) {
        this.cardNumber = cardNumber;
        this.pin = new Pin(pin);
        this.balance = 0;
        this.creditDebt = 0;
        this.creditLimit = 0;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void deposit(double amount, String pin) {
        if (this.pin.checkPin(pin)) {
            if (amount > 0) {
                if (this.creditDebt == 0) {
                    this.balance += amount;
                } else if (amount < this.creditDebt) {
                    this.creditDebt -= amount;
                } else if (amount == this.creditDebt) {
                    this.creditDebt = 0;
                } else {
                    this.creditDebt = 0;
                    this.balance = amount - this.creditDebt;
                }
            } else {
                warningAmountNotPositive("deposit");
            }
        }
    }

    public void warningAmountNotPositive(String operation) {
        System.out.println("Amount to " + operation + " must be positive.");
    }

    public void withdraw(double amount, String pin) {
        if (this.pin.checkPin(pin)) {
            if (amount > 0) {
                if (amount <= availableAmount()) {
                    if (this.balance == 0) {
                        this.creditDebt += amount;
                    } else if (amount > this.balance) {
                        this.balance = 0;
                        this.creditDebt += amount - this.balance;
                    } else {
                        this.balance -= amount;
                    }
                } else {
                    System.out.printf("The amount is too big. Maximum available amount is %.2f.", availableAmount());
                }
            } else warningAmountNotPositive("withdraw");
        }
    }

    public void printAccountInfo() {
        System.out.println();
        System.out.printf("Balance = %.2f, Debt = %.2f, Credit Limit = %.2f, Available Amount = %.2f %n", balance,
                creditDebt, creditLimit, availableAmount());
    }


}
