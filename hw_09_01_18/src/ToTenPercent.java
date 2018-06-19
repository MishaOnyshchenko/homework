import java.util.Scanner;

public class ToTenPercent {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scn = new Scanner (System.in);
        int num = scn.nextInt();
        System.out.println(plusTenPercent(num));
    }
    public static int plusTenPercent (int n){
        int res = n + (n*10/100);
        return res;
    }
}
