import java.util.Scanner;

public class MoreThanFive {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number:");
        Scanner scn = new Scanner (System.in);
        num = scn.nextInt();

        System.out.println(toFive(num));

    }
    static boolean toFive(int n){
        boolean res;
        if (n >= 5){
            res = true;
        }
        else{
            res = false;
        }
        return res;
    }
}
