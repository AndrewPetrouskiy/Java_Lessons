package homeworks.homework2;

import java.util.Scanner;

// *Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.

public class hw23 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Please enter the string: ");
        String example = iScanner.nextLine();
        iScanner.close();
        String reverse = reverseStringWithRecursion(example);
        System.out.println(reverse);

    }
    public static String reverseStringWithRecursion(String inputString) {
        String rightPart;
        String leftPart;
 
        int length = inputString.length();
 
        // заканчиваем рекурсивный обход
        if (length <= 1) {
            return inputString;
        }
 
        leftPart = inputString.substring(0, length / 2);
 
        rightPart = inputString.substring(length / 2, length);
 
        // рекурсивно переворачиваем левую и правую часть входной строки
        return reverseStringWithRecursion(rightPart) + reverseStringWithRecursion(leftPart);
    }
}
