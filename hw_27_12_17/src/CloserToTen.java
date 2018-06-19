import java.util.Scanner;

public class CloserToTen {
    public static void main(String[] args) {
        double m, n, resM, resN;
        System.out.println("Enter value for m: ");
        Scanner mScn = new Scanner(System.in);
        m = mScn.nextDouble();
        System.out.println("Enter value for n: ");
        Scanner nScn = new Scanner (System.in);
        n = nScn.nextDouble();
        if(m > 10){
            resM = m - 10;
        }
        else{
            resM = 10 - m;
        }
        if(n > 10){
            resN = n - 10;
        }
        else{
            resN = 10 - n;
        }
        if (resM < resN){
            System.out.println( m + " (m) is closer to 10");
        }
        else{
            System.out.println(n + " (n) is closer to 10");
        }
    }
}
