package homeworks;

public class homework1 {
    public static void main(String[] args) {
        int i = fill_variable();
        System.out.println("Random number:" + i);
        int n = findElderBit(i);
        System.out.println(" The most significant bit number:" + n);
        // Проверяем отрицательное число или положительное. Выбираем какой метод использовать.
        if (i >= 0) {
            int[] multiplesArray = multiplesNumbers(i, n);
            printArray(multiplesArray);
        } else {
            int[] notMultiplesArray = notMultiplesNumbers(i, n);
            printArray(notMultiplesArray);
        }
    }

    // Метод заполнения рандомного числа.
    public static int fill_variable() {
        return (int) Math.round((Math.random() * 2001) - 1000);
    }

    // Метод нахождения номера старшего значащего бита выпавшего числа
    public static int findElderBit(int number) {
        String elderBit = Integer.toBinaryString(number);
        System.out.println("Binary code:" + elderBit);
        return elderBit.length();
    }

    // Метод который находит все кратные n числа в диапазоне от i до Short.MAX_VALUE
    public static int[] multiplesNumbers(int randomNum, int n) {
        int difference = (Short.MAX_VALUE - randomNum) / n;
        //System.out.println(difference);
        int[] multiplesArray = new int[difference + 1];
        int count = 0;
        for (int i = randomNum; i <= Short.MAX_VALUE; i++) {
            if (i % n == 0) {
                multiplesArray[count] = i;
                count++;
            }
        }
        return multiplesArray;
    }

    // Метод который находит все некратные n числа в диапазоне от Short.MIN_VALUE до i
    public static int[] notMultiplesNumbers(int randomNum, int n) {
        int difference = (randomNum - Short.MIN_VALUE) - ((randomNum - Short.MIN_VALUE) / n);
        //System.out.println(difference);
        int[] notMultiplesArray = new int[difference + 1];
        int count = 0;
        for (int i = Short.MIN_VALUE; i <= randomNum; i++) {
            if (i % n != 0) {
                notMultiplesArray[count] = i;
                count++;
            }
        }
        return notMultiplesArray;
    }

    // Метод который распечатывает массив
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }


}
