public class RunValidator {

    public static void main(String[] args) {

        String input = " +38 050 A-363-AK-47-M16";
        Validator validator = new Validator();
        System.out.println("Number is valid: " + validator.validateNumber(input));
    }
}
