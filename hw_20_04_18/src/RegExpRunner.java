import java.util.regex.*;

public class RegExpRunner {

    /*Написать регулярное выражение которое проверяет корректность номера.
    Он правильный только если записан в формате +38 0.....
    и содержит правильное количество цифр украинского оператора связи.*/

    public static void main(String[] args) {

        checkPhoneNumber("+380503334455");//incorrect format
        checkPhoneNumber("+38 0507778899");//correct format

        checkEMail("vova@gmail.com");//correct format
        checkEMail("va$ya@gmail.som");//incorrect format

    }

    //This method is checking if phone number is correct
    public static void checkPhoneNumber(String number){
        Pattern p = Pattern.compile("^\\+38\\s0(\\d{9})");//declaring the pattern with the regular expression
        Matcher m = p.matcher(number); // declaring the matcher for matching phone number with the pattern

        //Check if true and print an answer
        System.out.println("Phone number is correct: " + m.matches());
        System.out.println("You entered: " + number);
        System.out.println("------------");
    }

    //This method is checking email format
    public static void checkEMail(String email){
        Pattern p = Pattern.compile("^[\\w_.]{3,20}@[a-z]{1,15}\\.(com|ua|ru|net)$");
        Matcher m = p.matcher(email);

        System.out.println("Format of email is correct: " + m.matches());
        System.out.println("You entered: " + email);
        System.out.println("------------");
    }
}
