package homeworks.homework2;

import java.util.Scanner;

// Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 
// Используем метод StringBuilder.append().

public class hw24 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("please enter the first number: ");
        int number1 = iScanner.nextInt();
        System.out.printf("please enter the second number: ");
        int number2 = iScanner.nextInt();
        iScanner.close();
        System.out.println(stringSum(number1, number2));
        System.out.println(stringSubtraction(number1, number2));
        System.out.println(stringMultiply(number1, number2));
        if (number2 == 0) {
            System.out.println("You can't divide by zero");
        } else {
            System.out.println(stringDivide(number1, number2));
        }

    }

    public static String stringSum(int num1, int num2) {
        int sum = num1 + num2;
        return new StringBuilder().append(num1).append("+").append(num2).append("=").append(sum).toString();
    }

    public static String stringSubtraction(int num1, int num2) {
        int subtraction = num1 - num2;
        return new StringBuilder().append(num1).append("-").append(num2).append("=").append(subtraction).toString();
    }

    public static String stringMultiply(int num1, int num2) {
        int multiply = num1 * num2;
        return new StringBuilder().append(num1).append("*").append(num2).append("=").append(multiply).toString();
    }

    public static String stringDivide(int num1, int num2) {
        double divide = num1 / num2;
        return new StringBuilder().append(num1).append("/").append(num2).append("=").append(divide).toString();
    }

}
