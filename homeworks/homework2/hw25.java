package homeworks.homework2;

// Замените символ “=” на слово “равно”. 
// Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

public class hw25 {
    public static void main(String[] args) {
        StringBuilder strb = new StringBuilder("5 + 6 = 11");
        System.out.println(changeWords(strb)); 
    }
    public static String changeWords(StringBuilder strb){
        
        int index = strb.indexOf("=");
        return strb.deleteCharAt(index).insert(index, "equals").toString();

    }
}
