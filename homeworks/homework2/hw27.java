package homeworks.homework2;

// **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

public class hw27 {
    public static void main(String[] args) {

        // Replace with StringBuilder

        long start = System.currentTimeMillis();
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            strb.append("=");
            strb.replace(i, i + 1, "Equals");
        }
        System.out.println(System.currentTimeMillis() - start);

        // Replac with String

        long start2 = System.currentTimeMillis();
        String str = new String();
        for (int i = 0; i < 100000; i++) {
            str = str + "=";
        }
        String newStr = str.replace("=", "equals");
        System.out.println(System.currentTimeMillis() - start2);
    }

}
