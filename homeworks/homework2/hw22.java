package homeworks.homework2;

// Напишите программу на Java, чтобы проверить, являются ли две данные строки вращением друг друга.

import java.util.Scanner;

public class hw22 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("please enter the first string, which you want to check on a palindrom: ");
        String example1 = iScanner.nextLine();
        System.out.printf("please enter the second string, which you want to check on a palindrom: ");
        String example2 = iScanner.nextLine();
        iScanner.close();

        // String example1 = "deified";
        // String example2 = "deified";
        // String example3 = "level";
        // String example4 = "leWel";

        if (isPalindrome(example1, example2) == true) {
            System.out.printf("%s and %s is a palindrom!", example1, example2);
        } else {
            System.out.printf("%s and %s isn't a palindrom!", example1, example2);
        }

    }

    public static boolean isPalindrome(String s, String s2) {
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) != s2.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
