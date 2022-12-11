package seminars.seminar6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class main {
    static def def = new def();
    static String tmp = "";

    public static void main(String[] args) {
        // def.methodAdd(5);
        // def.methodAdd(7);
        // def.methodAdd(5);
        // def.methodAdd(2);
        // def.methodAdd(1);
        // def.methodAdd(3);
        System.out.println(def.methodSize());

        Set<Integer> integer = new HashSet<>();
        Set<Integer> integer2 = new TreeSet<>();

        for (int i = 0; i < 5; i++) {
            int a = new Random().nextInt(0,10);
            System.out.print(a + " ");
            integer2.add(a);
        }
        
        for (int i = 0; i < 10; i++) {
            int a = new Random().nextInt(0,10);
            System.out.print(a + " ");
            def.methodAdd(a);
            integer.add(a);
        }

        System.out.println();
        System.out.println(def.methodRead());
        
        for (int a: integer) {
            System.out.println(a);
        }
        
        Iterator<Integer> abc = integer.iterator();
        while(abc.hasNext()) {
            int i = abc.next();
            System.out.print(i + " ");
            // abc.remove();
        }
        System.out.println();
        integer.forEach(n -> tmp += n + " ");

        System.out.println(tmp);
        // integer.removeAll(integer2);
        // System.out.println(integer.toString());

        List<Integer> a = integer.stream().filter(integer2:: contains).collect(Collectors.toList());
        System.out.println(a);



    }
    
}
