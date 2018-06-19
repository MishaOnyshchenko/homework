import java.util.Scanner;

public class StringToChar {
    public static void main(String[] args) {
        System.out.println("Enter a text: ");
        Scanner scn = new Scanner (System.in);
        String myString = scn.nextLine();
        System.out.println("You entered string: " + myString);
        char myArray [] = myString.toCharArray();
        for (char i : myArray) {
            System.out.print(i + "-");
        }
    }
}
