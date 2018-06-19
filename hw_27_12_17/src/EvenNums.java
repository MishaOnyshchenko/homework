import java.util.Scanner;

public class EvenNums {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        if(n % 2 == 0){
            System.out.println("Yes, it's even number!");
        }
        else{
            System.out.println("No, it isn't even number!");
        }
    }
}
