import java.util.Random;
import java.util.Scanner;

public class Quest {
    public static void main(String[] args) {
        System.out.println("\nНаступили выходные и вы захотели провести их за пределами своего города. \n" +
                "\nКуда желаете отправиться?\n" +
                "\n1. Петриковка\n"+
                "2. Кицмань\n"+
                "3. Тернополь\n" +
                "\nВведите порядковый номер города: "
        );
        Scanner scn = new Scanner (System.in);
        int answer = scn.nextInt();
        switch (answer){
            case 1:
                System.out.println("Вы решили поехать на фестиваль петриковской росписи.");
                break;
            case 2:
                System.out.println("Вы захотели отправиться за западным колоритом в Кицмань.");
                break;
            case 3:
                System.out.println("Вас посетило странное желание побывать в Тенополе.");
                break;
            default:
                System.out.println("Похоже, что вы издеваетесь... т.к. такой вариант отсутствует, то вас отправили посетить \"файне мiсто Тернопiль\".");
                break;
        }
        System.out.println("В электричке вы встречаете компанию приятных молодых людей, которые предлагают вам выпить и сыграть в напёрстки.\n"+
        "Ваш выбор (введите цифру): \n"+
                "1. Выпить\n"+
                "2. Сыграть в напёрстки\n");
        Scanner scn2 = new Scanner (System.in);
        int answer2 = scn2.nextInt();
        switch (answer2){
            case 1:
                System.out.println("Вы очнулись в больнице с отравлением клофелином и вынуждены провести остаток выходных на больничной койке...\n"+"Продолжение следует...");
                break;
            case 2:
                System.out.println("Вы принимаете заманчивое предложение сыграть в напёрстки.");
                Random rnd = new Random(System.currentTimeMillis());
                int cup = 1 + rnd.nextInt(3);
                System.out.println("Катала кладёт шарик под напёрсток №: " + cup + " и начинает крутить их между собой.");
                Random rnd2 = new Random(System.currentTimeMillis());
                int limit = 3;
                int newCup = 1 + rnd2.nextInt(limit);
                //System.out.println("New: " + newCup);
                System.out.println("У нас есть 3 напёрстка. Укажите номер под каким из них сейчас находится шарик: \n"+
                        "Напёрсток № 1\n" +
                        "Напёрсток № 2\n" +
                        "Напёрсток № 3\n");
                Scanner scn3 = new Scanner (System.in);
                int choiсe = scn3.nextInt();
                if (newCup == choiсe) {
                    System.out.println("\nНаши поздравления! Вы выиграли и благополучно достигли пункта назначения. The end.\n");
                }
                else{
                    System.out.println("\nПростите, но вы ошиблись и лишились всех денег. The end.\n");
                }

                break;
            default:
                System.out.println("Ребята не поняли вашего юмора и на ближайшей станции вас забрали на скорой помощи с переломами нижних конечностей...\n"+ "Продолжение следует...");
                break;
        }
    }
}
