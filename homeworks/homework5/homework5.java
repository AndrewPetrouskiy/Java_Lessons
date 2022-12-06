package homeworks.homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class homework5 {
    public static void main(String[] args) {
        // Создать словарь HashMap. Обобщение <Integer, String>.
        // *Создать TreeMap, заполнить аналогично.
        
        Map<Integer, String> mp = new HashMap<>();
        Map<Integer, String> tm = new TreeMap<>();

        // Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)

        mp.put(1, "Red");
        mp.put(2, "Black");
        mp.putIfAbsent(3, "White");

        // TreeMap, заполнить аналогично.

        tm.put(1, "Red");
        tm.put(2, "Black");
        tm.putIfAbsent(3, "White");

        // Изменить значения дописав восклицательные знаки.

        Set<Integer> keySet = mp.keySet();
        for (int i : keySet) {
            mp.compute(i, (k, v) -> v = v + "!");
        }
        mp.forEach((k, v) -> System.out.println("Key:" + k + " and value:" + v));
        System.out.println();

        // TreeMap, заполнить аналогично.

        Set<Integer> keySet1 = tm.keySet();
        for (int i : keySet1) {
            tm.compute(i, (k, v) -> v = v + "!");
        }
        tm.forEach((k, v) -> System.out.println("Key:" + k + " and value:" + v));

        // *Увеличить количество элементов таблиц до 1000 случайными ключами и общей
        // строкой.

        int count = 1000;

        while (mp.size() < count) {
            int ran = new Random().nextInt(1, 1001);
            mp.putIfAbsent(ran, "Good");
        }
        System.out.println(mp.size());

        // TreeMap, заполнить аналогично.

        while (tm.size() < count) {
            int ran = new Random().nextInt(1, 1001);
            tm.putIfAbsent(ran, "Great");
        }
        System.out.println(tm.size());

        // Сравнить время прямого и случайного перебора тысячи элементов HashMap.

        long start = System.nanoTime();
        keySet = mp.keySet();
        for (int i : keySet) {
            mp.get(i);
        }
        System.out.print("It's the time of sequential enumeration of numbers in HashMap: ");
        System.out.println(System.nanoTime() - start);

        long start3 = System.nanoTime();
        for (int i = 0; i < count; i++) {
            int ran = new Random().nextInt(1, 1001);
            mp.get(ran);
        }
        System.out.print("It's the time of random enumeration of numbers in HashMap: ");
        System.out.println(System.nanoTime() - start3);

        // Сравнить время прямого и случайного перебора тысячи элементов Treemap.

        long start2 = System.nanoTime();
        keySet1 = tm.keySet();
        for (int i : keySet1) {
            tm.get(i);
        }
        System.out.print("It's the time of sequential enumeration of numbers in Treemap: ");
        System.out.println(System.nanoTime() - start2);

        long start4 = System.nanoTime();
        for (int i = 0; i < count; i++) {
            int ran = new Random().nextInt(1, 1001);
            tm.get(ran);
        }
        System.out.print("It's the time of random enumeration of numbers in Treemap: ");
        System.out.println(System.nanoTime() - start4);
    }
}
