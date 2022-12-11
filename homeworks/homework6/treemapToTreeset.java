package homeworks.homework6;

import java.util.Map;
import java.util.TreeMap;

// Реализовать множество (set) с помощью TreeMap. Создать метод add, добавляющий элемент в ваше множество. 
// Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел.
//  Объявить и инициализировать TreeSet использующий ваш компаратор. Добавить несколько эллементов в сет и вывести в консоль.

public class treemapToTreeset {
    private Map<Integer, Object> treeM = new TreeMap<>();


    private static final Object NOTHING = new Object();

    public void addElement(int x){
        treeM.put(x, NOTHING);
    }

    public String outputElemets() {
        return treeM.keySet().toString();
    }
}
