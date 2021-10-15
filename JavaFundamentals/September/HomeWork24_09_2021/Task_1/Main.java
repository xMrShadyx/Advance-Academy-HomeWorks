package adv.JavaFundamentals.September.HomeWork24_09_2021.Task_1;

public class Main {
    public static void main(String[] args) {
        double givenMoney = 20;
        double[] priceInCart = {200};

        tipConverter(givenMoney, returnCartAmount(priceInCart));

    }

    public static double returnCartAmount(double[] priceInCart) {
        double currentBill = 0;
        for (int i = 0; i < priceInCart.length; i++) {
            currentBill += priceInCart[i];
        }
        return currentBill;
    }


    public static void tipConverter(double givenMoney, double currentBill) {
        if (currentBill < givenMoney) {
            System.out.printf("Ресто %.2f лева.", givenMoney - currentBill);
        } else if (currentBill > givenMoney) {
            System.out.printf("Парите не стигат трябва дадете още %.2f лева", currentBill - givenMoney);
        } else {
            System.out.println("Благодаря, хубав ден");
        }
    }
}
