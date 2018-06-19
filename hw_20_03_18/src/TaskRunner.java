import java.util.*;

public class TaskRunner {
    public static void main(String[] args) {
        printHashMap();//task #1
        noRepeatValue();//task #2
        checkTheKey();//task #3
        putIfAbsent();//task #4
    }
    /*1.Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
    Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    Пример вывода (тут показана только одна строка): Sim - 5*/
    public static void printHashMap() {
        Map<String, Object> collection = new HashMap<>();
        collection.put("k1", 1);
        collection.put("k2", 2);
        collection.put("k3", 3);
        collection.put("k4", 4);
        collection.put("k5", 5);
        collection.put("k6", 6);
        collection.put("k7", 7);
        collection.put("k8", 8);
        collection.put("k9", 9);
        collection.put("k10", 10);
        collection.forEach((K, V) -> System.out.println(K + " - " + V));
    }
    /*2.Пользователь вводит набор  произвольных чисел в виде одной строки
    (“1, 2, 3, 4, 4, 5,33,33,8,8,89,0б”).
    Избавиться от повторяющихся элементов в строке и вывести результат на экран.*/
    public static void noRepeatValue() {
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 4, 5, 33, 33, 8, 8, 89, 0));
        System.out.println("\n" + set);
    }
    /*3. Есть карта Map<String, String> map = new HashMap<>();
    map.put("C", "c");
    проверить есть ли в ней ключ "Е", если нет такого вывести "нет такого"*/
    public static void checkTheKey() {
        Map<String, String> map = new HashMap<>();
        map.put("C", "c");
        if (!map.containsKey("E")) {
            System.out.println("\nNo such element");
        }
    }
    /*4. есть карта Map<String, String> map = new HashMap<>();
    map.put("C", "c");
    map.put("B", "b");
    положить туда пару "B", "bob" если такого ключа нет.*/
    public static void putIfAbsent() {
        Map<String, String> map = new HashMap<>();
        map.put("C", "c");
        map.put("B", "b");
        map.putIfAbsent("B", "bob");
        System.out.println("\n" + map);
    }
}
