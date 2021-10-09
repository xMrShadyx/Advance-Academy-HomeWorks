package adv.JavaFundamentals.HomeWork09_10_2021.Task_2;

public class Main {

    public static void main(String[] args) {
        String encryptResult = (String) encrypt("This is a test!", 2);

        System.out.print("Encrypted: -> ");
        System.out.println(encryptResult);

        System.out.print("Decrypted: -> ");
        System.out.println(decrypt(encryptResult,2));
    }

    public static Object encrypt(String text, final int n) {
        if (n <= 0 || text.isEmpty()) return text;

        String getAllEvenChars = "";
        String getAllOddChars = "";

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < text.length(); i++) {
                if (i % 2 == 0) {
                    getAllEvenChars += text.charAt(i);
                } else {
                    getAllOddChars += text.charAt(i);
                }
            }
            text = getAllOddChars + getAllEvenChars;
            getAllEvenChars = "";
            getAllOddChars = "";
        }

        return text;
    }

    public static Object decrypt(String encryptedText, final int n) {
        if (n <= 0 || encryptedText.isEmpty()) return encryptedText;

        // Getting length of encryptedText divided by 2, so to count of all even numbers.
        // so we know how many times to iterate over nested (For loop) to concatenate encryptedText back to old self.
        int counter = encryptedText.length() / 2;
//        if (encryptedText.length() % 3 == 0);

        for (int j = 0; j < n; j++) {
            // First part of encrypted text length / 2, so we can separate it to two parts, and concatenate it back to itself.
            String firstPart = encryptedText.substring(0, encryptedText.length() / 2);
            // Second part of encryptedText.
            String secondPart = encryptedText.substring(encryptedText.length() / 2);
            // Temp result of firstPart + secondPart that resets every cycle.
            String tempResult = "";
            // Nested for loop, that concatenate firstPart and secondPart to one string (tempResult).
            for (int i = 0; i < counter; i++) {
                tempResult += secondPart.charAt(i);
                tempResult += firstPart.charAt(i);
            }
            // Това съм го направил по тоя начин, защото не мога да итерирам през стринг с нечетен брой символи и не мога да достъпя
            // последния елемент от стринга.
            if (encryptedText.length() % 3 == 0) {
                encryptedText = tempResult + encryptedText.charAt(encryptedText.length() - 1);
            }
            else {
                encryptedText = tempResult;
            }
        }

        // encryptedText gets value of tempResult, so tempResult can be reset next iteration.
        return encryptedText;
    }
}
