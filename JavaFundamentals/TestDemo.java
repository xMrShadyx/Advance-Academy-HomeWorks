package adv.JavaFundamentals;

public class TestDemo {
    public static void main(String[] args) {
//        String encryptResult = (String) encrypt("This is a test!", 1);
//        System.out.print("Encrypted: -> ");

        String encryptResult = "This is a test!";

        StringBuilder result = new StringBuilder();
        String firstPart = encryptResult.substring(0, encryptResult.length() / 2);
        String secondPart = encryptResult.substring(encryptResult.length() / 2);
        System.out.println("Size of : " + encryptResult.length());
        System.out.println(firstPart);
        System.out.println(secondPart);
        System.out.println("For loop below...");

        for (int i = 0; i < encryptResult.length(); i++) {
            System.out.println(encryptResult.charAt(i));
        }


//        int counter = encryptResult.length() / 2;
//        for (int i = 0; i < counter; i++) {
//            System.out.print(secondPart.charAt(i));
//            System.out.print(firstPart.charAt(i));
//        }
//
//        System.out.println(result);
    }

    public static Object encrypt(String text, final int n) {
        if (n <= 0 || text.isEmpty()) return text;

        String result = "";
        String secondPart = "";

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < text.length(); i++) {
                if (i % 2 == 0) {
                    result += text.charAt(i);
                } else {
                    secondPart += text.charAt(i);
                }
            }
            text = secondPart + result;
            result = "";
            secondPart = "";
        }

        return text;
    }
}
