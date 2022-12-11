package homeworks.homework6;

import java.util.Comparator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

// Реализовать множество (set) с помощью TreeMap. Создать метод add, добавляющий элемент в ваше множество. 
// Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел.
//  Объявить и инициализировать TreeSet использующий ваш компаратор. Добавить несколько эллементов в сет и вывести в консоль.

public class main {

    static treemapToTreeset trSet = new treemapToTreeset();
    
    public static void main(String[] args) {
    // add new 5 elements in our own set
        for (int i = 0; i < 5; i++) {
        int a = new Random().nextInt(500);
        trSet.addElement(a);
        }
        System.out.println(trSet.outputElemets());

        // use comparataor and Treeset

        Set<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o2 > o1)
                return 1;
                else if (o2 < o1)
                return -1;
                else 
                return 0;

            }
        });

        // заполняем set 10 рандомными числами
        for (int i = 0; i < 10; i++) {
            int a = new Random().nextInt(500);
            System.out.print(a + " ");
            set.add(a);
        }
        System.out.println();
        set.forEach(n -> System.out.print(n + " "));
    }
}
