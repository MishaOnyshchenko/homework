public class Runner {

    public static void main(String[] args) {

        recursion(22);

        System.out.println("Fib number is " + fib(9));
    }

    public static int recursion(int num){
        if (num < 0) {
            return 0;
        }
        System.out.println(num);
        return recursion(num-1);
    }

    public static int fib (int n){
        if (n < 1){
            return 1;
        }
        return fib(n-1) + fib (n-2);
    }

}
