package adv.JavaFundamentals.HomeWork15_09_2021.Task_2;

public class Client {
    private String name;
    private String pinCode;
    private double balance;
    private int wrongPin;

    public Client(String name) {
        this.name = name;
        this.pinCode = "0101";
        this.balance = 10000;
    }

    public double getBalance() {
        return balance;
    }

    public void withdrawalBalance(double balance) {
        this.balance -= balance;
    }

    public void withdraw(double amount) {
        if (amount == 10 || amount == 20 || amount == 50 || amount == 100 || amount == 200 || amount == 300 || amount == 400) {
            withdrawalBalance(amount);
            System.out.println("Вие изтеглихте " + amount + "\nОстатъчната сметка по вашата сметка е " + getBalance());
        } else {
            System.out.println("Невалидна сума опитайте отново");
        }

    }

    public String getPinCode() {
        return pinCode;
    }

    public int getWrongPin() {
        return wrongPin;
    }

    public void incrementWrongPin() {
        this.wrongPin++;
    }

    public void setWrongPin(int wrongPin) {
        this.wrongPin = wrongPin;
    }

    public void showBalance(String getPin) {
        if (getWrongPin() >= 3) {
            System.out.println("Your account was blocked!");
        } else {
            if (getPin.equals(getPinCode())) {
                System.out.println(getBalance());
            } else {
                System.out.println("Wrong pinCode.");
                incrementWrongPin();
            }
        }
    }

    public void helpFromIndianGuy() {
        setWrongPin(0);
    }

}
