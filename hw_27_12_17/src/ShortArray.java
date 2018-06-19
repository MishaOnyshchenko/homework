public class ShortArray {
    public static void main(String[] args) {
        short arr [] = new short[101];
        for (short i = 0, j = 100; j >= 0; i++, j--){
         arr[i] = j;
        }
        for (short i : arr) {
            System.out.println(i);
        }
    }
}
