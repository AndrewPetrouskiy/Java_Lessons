package homeworks.homework3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class hw31 {
    private static List array2;

    public static void main(String[] args) {
        // Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        ArrayList<String> array1 = new ArrayList<>();
        array1.add("Red");
        array1.add("White");
        array1.add("Blue");
        array1.add("Black");
        array1.add("Yellow");
        array1.add("Gray");
        array1.add("Pink");
        array1.forEach(i -> System.out.println(i));
        // Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        System.out.println();
        for (String item : array1) {
            item = item + "!";
            System.out.println(item);
        }
        // Вставить элемент в список в первой позиции.
        array1.add(0, "Purple");
        // Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println();
        String el = array1.get(2);
        System.out.println(el);
        System.out.println();
        // Обновить определенный элемент списка по заданному индексу.
        array1.set(5, "Orange");
        // Удалить третий элемент из списка.
        array1.remove(2);
        // Поиска элемента в списке по строке.
        int index =  array1.indexOf("Blue");
        System.out.println(index);
        System.out.println();
        array2 = array1.subList(1, array1.size()-2);
        array2.forEach(i -> System.out.println(i));
        System.out.println();
        // Удалить из первого списка все элементы отсутствующие во втором списке.
        array1.retainAll(array2);
        array1.forEach(i -> System.out.println(i));
        System.out.println();
        // *Сортировка списка.
        Collections.sort(array1);
        array1.forEach(i -> System.out.println(i));
        // *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
        // ArrayList
        long start = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            array1.add(0, "new element");
        }
        System.out.println("It's the time of work ArrayList");
        System.out.println(System.currentTimeMillis() - start);

        // LinkedList
        LinkedList<String> linkedarray = new LinkedList<>();
        long start2 = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            linkedarray.add(0, "new element");
        }
        System.out.println("It's the time of work LinkedArray");
        System.out.println(System.currentTimeMillis() - start2);
    }
}
