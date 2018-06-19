public class Loops {
    public static void main(String[] args) {
        int i = -10;
        while (i <= 25){
            System.out.println(i);
            i++;
        }
        System.out.println("=====");

        int j = -10;
        do{
            System.out.println(j);
            j++;
        }
        while(j <= 25);
        System.out.println("=====");

        for (int k = -10; k <= 25; k++){
            System.out.println(k);
        }
    }
}
