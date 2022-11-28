package homeworks.homework2;

// *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

public class hw26 {
    public static void main(String[] args) {
        StringBuilder strb = new StringBuilder("5 + 6 = 11");
        System.out.println(changeWords(strb));

    }

    public static String changeWords(StringBuilder strb){
        
        int index = strb.indexOf("=");
        return strb.replace(index, index+1, "Equals").toString();

    }
}
