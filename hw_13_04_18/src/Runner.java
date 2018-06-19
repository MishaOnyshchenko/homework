import java.lang.reflect.Field;

        /*-Написать метод который принимает входящим параметром любой объект,
        и преобразует все стринговые поля входящего обьекта в нижний регистр.
- аналогично, но метод  преобразует все строковые поля объекта в верхний регистр.
У Объекта могут быть поля разных типов,строка, логический тип, целочисленный и т.д*/

public class Runner {

    public static void main(String[] args) throws IllegalAccessException {

        //Creating and printing new object
        TestNewObject obj = new TestNewObject();
        System.out.println(obj);
        System.out.println("============");

        //Changing to lowerCase
        Runner.toLowerCase(obj);
        System.out.println("============");

        //Changing to upperCase
        Runner.toUpperCase(obj);

    }

    public static void toLowerCase(TestNewObject obj) throws IllegalAccessException {

        Class myClass = TestNewObject.class;
        Field[] fields = myClass.getFields();

        String checkIfString = "class java.lang.String";

        for (Field f : fields) {
            if (checkIfString.equals(f.getType().toString())) {
                System.out.println("Old " + f.getName() + ": " + f.get(obj));
                f.set(obj, f.get(obj).toString().toLowerCase());
                System.out.println("ToLowerCase " + f.getName() + ": " + f.get(obj));
            }
        }
    }

    public static void toUpperCase(TestNewObject obj) throws IllegalAccessException {
        Class myClass = TestNewObject.class;
        Field[] fields = myClass.getFields();

        String checkIfString = "class java.lang.String";

        for (Field f : fields) {
            if (checkIfString.equals(f.getType().toString())) {
                System.out.println("Old " + f.getName() + ": " + f.get(obj));
                f.set(obj, f.get(obj).toString().toUpperCase());
                System.out.println("ToUpperCase " + f.getName() + ": " + f.get(obj));
            }
        }
    }
}
