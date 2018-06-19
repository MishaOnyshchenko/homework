import java.util.*;

public class TestCollections {

    public static void main(String[] args) {
        //names(); //task #1
        //randomNum();//task #2
        //subList();//task #3
        //listTest();//task #4
        //treeSetExampleSort();//task #5(1)
        //hashSetExampleSort();//task #5(2)
        //arrayListExampleSort();//task #5(3)
        //linkedListExampleSort();//task #5(4)
    }

    public static void names() {
        /*1. Создать структуру данных которая содержит в себе имена :
        Аня. Виктор, Игнат, Валентин,Игорь, Оля, Света, Таня.*/
        List<String> namesList = new LinkedList<>();
        namesList.add("Anna");
        namesList.add("Victor");
        namesList.add("Ignat");
        namesList.add("Valentin");
        namesList.add("Igor");
        namesList.add("Olya");
        namesList.add("Sveta");
        namesList.add("Tanya");
        /*Создать еще одну структуру данных, но которая будет содержать только уникальные значения,
        заполнить ее полями предыдущей структуры.*/
        Set<String> namesSet = new LinkedHashSet<>(namesList);

        /*-Добавить в обе структуры данных имена:
        Виктор, Игнат, Иннакентий, Тит, Ждери, Освальд, Фернандо, после вывести их содержание.*/
        namesList.add("Victor");
        namesList.add("Ignat");
        namesList.add("Innokentiy");
        namesList.add("Tit");
        namesList.add("Zhdery");
        namesList.add("Osvald");
        namesList.add("Fernando");

        namesSet.add("Victor");
        namesSet.add("Ignat");
        namesSet.add("Innokentiy");
        namesSet.add("Tit");
        namesSet.add("Zhdery");
        namesSet.add("Osvald");
        namesSet.add("Fernando");

        System.out.println("LinkedList contains: ");
        for (String name : namesList) {
            System.out.println(name);
        }
        System.out.println();

        System.out.println("LinkedHashSet contains: ");
        for (String name : namesSet) {
            System.out.println(name);
        }
    }

    public static void randomNum() {
        /*2. Создать коллекцию, которая заполнена случайными числами от -25 до 50,*/
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < 33; i++) {
            numbers.add((int) (Math.random() * 76) - 25);
        }
        /*вывести минимальное и максимальное значение*/
        System.out.println("Min: " + numbers.first());
        System.out.println("Max: " + numbers.last());
        /*- есть числа 8, -12, 0, 22, 5.
        Проверить содержит ли наша коллекция данные числа после заполнения.
        Если да - выводим правду, в противном случае лож.*/
        ArrayList<Integer> myNumbers = new ArrayList<>(Arrays.asList(8, -12, 0, 22, 5));
        System.out.println(numbers.containsAll(myNumbers));
    }


    public static void subList() {
        /*3. Создать список, который заполнить числами от 8 до 24.*/
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 8; i <= 24; i++) {
            arrayList.add(i);
        }
        /*Далее создать второй список, который заполнить числами из первой коллекции,
        которые находятся с 5 по 12 позиции.*/
        List<Integer> subArrayList = new ArrayList<>(arrayList.subList(4, 12));
        /* Вывести обе коллекции на экран.*/
        for (Integer arr : arrayList) {
            System.out.println(arr);
        }
        System.out.println();
        for (Integer subArr : subArrayList) {
            System.out.println(subArr);
        }
    }

    public static void listTest() {
        /*4. Создать список, который заполнен числами от 25 до 99.*/
        List<Integer> list = new LinkedList<>();
        for (int i = 25; i <= 99; i++) {
            list.add(i);
        }
        /*Удалить часть данных из середины списка. С (15 по 43 элемент)*/
        list.subList(14, 44).clear();
        for (Integer l: list) {
            System.out.println("l = " + l);
        }
    }

    /*5. Найти способ как сортировать объекты (объект на базе собственного класса) в коллекциях
    TreeSet, HashSet, ArrayList, LinkedList. Написать по одному примеру для каждой коллекции.*/
    public static void treeSetExampleSort(){
        TreeSet<Dog> dogTreeSet = new TreeSet<>(new DogAgeComparator());
        Dog dog1 = new Dog("Bruce", 78);
        Dog dog2 = new Dog ("Chuck", 284);
        Dog dog3 = new Dog("Arni", 70);
        dogTreeSet.add(dog1);
        dogTreeSet.add(dog2);
        dogTreeSet.add(dog3);
        for (Dog dog: dogTreeSet ) {
            System.out.println(dog);
        }
    }

    public static void hashSetExampleSort(){
        Set <Dog> dogHashSet = new HashSet<>();
        Dog dog1 = new Dog("Dik", 3);
        Dog dog2 = new Dog ("Chen", 4);
        Dog dog3 = new Dog("Bob", 5);
        dogHashSet.add(dog1);
        dogHashSet.add(dog2);
        dogHashSet.add(dog3);

        Set<Dog> dogHashSetConvertedToTreeSet = new TreeSet<>(dogHashSet);

        for (Dog dog: dogHashSetConvertedToTreeSet ) {
            System.out.println(dog);
        }
    }

    public static void arrayListExampleSort(){
        List <Dog> dogArrayList = new ArrayList<>();
        Dog dog1 = new Dog("Gun", 10);
        Dog dog2 = new Dog ("Fred", 20);
        Dog dog3 = new Dog("Eva", 30);
        dogArrayList.add(dog1);
        dogArrayList.add(dog2);
        dogArrayList.add(dog3);

        Collections.sort(dogArrayList);

        for (Dog d: dogArrayList) {
            System.out.println(d);
        }
    }
    public static void linkedListExampleSort(){
        List <Dog> dogLinkedList = new LinkedList<>();
        Dog dog1 = new Dog("Zorro", 15);
        Dog dog2 = new Dog ("Tor", 10);
        Dog dog3 = new Dog("Alfred", 5);
        dogLinkedList.add(dog1);
        dogLinkedList.add(dog2);
        dogLinkedList.add(dog3);

        Collections.sort(dogLinkedList, new DogNameComparator());

        for (Dog d: dogLinkedList) {
            System.out.println(d);
        }
    }
}

