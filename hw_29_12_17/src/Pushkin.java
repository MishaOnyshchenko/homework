import java.sql.SQLOutput;

public class Pushkin {
    public static void main(String[] args) {
        String str = new String ("Был и я среди донцов...\n" +
                "Была пора: наш праздник молодой...\n" +
                "В альбом (Гонимый рока самовластьем...)\n" +
                "В альбом (Долго сих листов заветных...)\n" +
                "В альбом А. О. Смирновой\n" +
                "В альбом княжны А. Д. Абамалек\n" +
                "В альбом Павлу Вяземскому\n" +
                "В еврейской хижине лампада...\n" +
                "В крови горит огонь желанья...\n" +
                "В мои осенние досуги...\n" +
                "В начале жизни школу помню я...\n" +
                "В поле чистом серебрится Снег...");

        System.out.println(str.replace("В", ":-)"));
        System.out.println("===================================");

        char arr [] = str.toCharArray();
        for (int i = 0; i < str.length(); i++){
            if(i % 2 == 1){
                System.out.print(arr[i] + "-");
            }
        }
        System.out.println("\n===================================");

        String album [] = str.split(" ");
        int cnt = 0;
        for (String i : album){
            if (i.equals("альбом")){
                cnt++;
            }
        }
        System.out.println("Album used: " + cnt +" times.");
    }
}
