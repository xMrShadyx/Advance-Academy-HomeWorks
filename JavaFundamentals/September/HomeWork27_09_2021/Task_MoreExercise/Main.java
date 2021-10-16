package adv.JavaFundamentals.September.HomeWork27_09_2021.Task_MoreExercise;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(monkeyTrouble(true, true));
//        System.out.println(monkeyTrouble(false, false));
//        System.out.println(monkeyTrouble(true, false));

//        System.out.println(parrotTrouble(true, 6));
//        System.out.println(parrotTrouble(true, 7));
//        System.out.println(parrotTrouble(false, 6));

//        System.out.println(sumDouble(1, 2));
//        System.out.println(sumDouble(3, 2));
//        System.out.println(sumDouble(2, 2));

//        System.out.println(stringTimes("Hi", 2));
//        System.out.println(stringTimes("Hi", 3));
//        System.out.println(stringTimes("Hi", 1));

//        System.out.println(array123(new int[]{1, 1, 2, 3, 1}));
//        System.out.println(array123(new int[]{1, 1, 2, 4, 1}));
//        System.out.println(array123(new int[]{1, 1, 2, 1, 2, 3}));

//        System.out.println(cigarParty(30, false));
//        System.out.println(cigarParty(50, false));
//        System.out.println(cigarParty(70, true));

//        System.out.println(caughtSpeeding(60, false));
//        System.out.println(caughtSpeeding(65, false));
//        System.out.println(caughtSpeeding(65, true));

//        System.out.println(squirrelPlay(70, false));
//        System.out.println(squirrelPlay(95, false));
//        System.out.println(squirrelPlay(95, true));

//        System.out.println(makeMiddle(new int[]{1, 2, 3, 4}));
//        System.out.println(makeMiddle(new int[]{7, 1, 2, 3, 4, 9}));
//        System.out.println(makeMiddle(new int[]{1, 2}));


    }
    // #1
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile && bSmile || !bSmile && !aSmile;
    }

    // #2
    public static boolean parrotTrouble(boolean talking, int hour) {
        return (hour < 7 || hour > 20) && talking;
    }

    // #3
    public static int sumDouble(int a, int b) {
        return a == b ? (a + b) * 2 : a + b;
    }

    // #4
    public static String stringTimes(String str, int n) {
        return str.repeat(n);
    }

    // #5
    public static boolean array123(int[] nums) {
        return Arrays.toString(nums).replaceAll(", ", "").contains("123");
    }

    // #6
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return cigars > 40 && cigars < 60 || isWeekend && cigars > 40;
    }

    // #7
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }

        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }

    // #8
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        return (temp >= 60 && temp <= 90) || (temp >= 60 && temp <= 100 && isSummer);
    }

    // #9
    public static String makeMiddle(int[] nums) {
        int[] newArray = new int[2];

        if (nums.length % 2 == 0) {
            newArray[0] = nums[nums.length / 2 - 1];
            newArray[1] = nums[(nums.length / 2)];
        }
        return Arrays.toString(newArray);
    }
}
