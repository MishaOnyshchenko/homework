package any_type_array;

public class AnyTypeArrayTest<Arr> {
    /*Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
    Реализовать метод, который возвращает любой элемент массива по индексу*/
    public static void main(String[] args) {
        String[] stringArray = {"This", "is", "String", "array"};
        Integer[] intArray = {1, 2, 3, 4, 5};

        AnyTypeArray<String> arrayS = new AnyTypeArray<>(stringArray);
        AnyTypeArray<Integer> arrayI = new AnyTypeArray<>(intArray);

        System.out.println(arrayS.getElement(3));
        System.out.println(arrayI.getElement(4));
    }
}
