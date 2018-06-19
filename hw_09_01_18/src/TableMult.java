public class TableMult {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                int res = j * i;
                System.out.print(res + "\t");
            }
            System.out.println();
        }
        System.out.println("=======================================");

        for (int i = 10; i >= 1; i--){
            for (int j = 10; j >=1; j--){
                int reverse = j * i;
                System.out.print(reverse + "\t");
            }
            System.out.println();
        }
    }
}
