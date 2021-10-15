package adv.JavaFundamentals.September.Task_1;

public class Main {
    public static void main(String[] args) {

        // Hyusein BulBank Financing
        // Credit Calculator :D
        finance("Smith", getAge(19),1000,57, 200);

    }
    // Валидация на годините.
    public static boolean getAge(int age) {
        boolean result = true;

        if (age < 18) {
            System.out.println("Трябва да имате навършени 18г. За да изтеглите кредит.");
            result = false;
        }
        return result;
    }

    public static void finance(String name, boolean age, double amount, int months, double monthlyIncome) {

        // Валидира първа стъпка, че сумата не е под 1000 лв. и месецете не са над 12.
        if (amount <= 1000 && months > 12 && age) {
            System.out.println("НЕ може да изтеглите такава сума за този период.");
            return;
        }
        double monthlyDeposit = amount / months;

        // Ако сумата, която иска да изтегли потребителят е по-голяма от 50000 проверете още дали доходът
        // му е над 2000 лева. Ако е над 2000 лева се показва колко е месечната му вноска
        if (amount >= 50000 && (monthlyIncome > 2000 && monthlyIncome < 5000)) {
            if (age) {
                System.out.printf("Здравейте г-н/жо %s,вие кандидатствате за сума от %.2f лева," +
                        " за период от %d месеца със вноска от %.2f лева.", name, amount, months, monthlyDeposit);
            }

            // Проверява дали доходът е над 5000 лева ако е над тази сума и парите, които иска да изтегли човекът
            // са под 100 000 лева му изкарайте текст с месечната вноска и добавете "С такъв доход можем да ви предложим 100 000 лева.
        } else if (monthlyIncome > 5000 && amount < 100_000) {
            if (age) {
                System.out.printf("С такъв доход можем да ви предложим 100 000 лева. %s,вие кандидатствате за сума от %.2f лева," +
                        " за период от %d месеца със вноска от %.2f лева.", name, amount, months, monthlyDeposit);
            }
        } else {
            // Всички останали кредити. Със по малки суми от горе посочените.
            if (amount < 50000 && monthlyIncome < 2000) {
                if (age) {
                    System.out.printf("Здравейте г-н/жо %s,вие кандидатствате за сума от %.2f лева," +
                            " за период от %d месеца със вноска от %.2f лева.", name, amount, months, monthlyDeposit);
                }
            } else {
                System.out.println("Съжаляваме, но максимумът за такъв доход е 20000 лева");
            }
        }
    }
}
