public class Calc {

    public static void main(String[] args) {
        double num1 = getDouble();
        char operation = getOperation();
        double num2 = getDouble();
        char operation2 = getOperation();
        double result = calc(num1, num2, operation, operation2);
        System.out.println("Result: " + result);
    }

    public static double getDouble() {
        System.out.println("Enter a number: ");
        Scanner scn = new Scanner(System.in);
        double num = scn.nextDouble();
        return num;
    }

    public static char getOperation(){
        System.out.println("Enter an operation: ");
        char symbol;
        Scanner scn = new Scanner(System.in);
        symbol = scn.next().charAt(0);
        return symbol;
    }

    public static double calc(double num1, double num2, char operation, char operation2){
        double res;

        if (operation2 == '%') {
            switch (operation) {
                case '+':
                    res = num1 + (num1 * num2 / 100);
                    break;
                case '-':
                    res = num1 - (num1 * num2 / 100);
                    break;
                case '*':
                    res = num1 * (num1 * num2 / 100);
                    break;
                case '/':
                    res = num1 / (num1 * num2 / 100);
                    break;
                default:
                    res = 0;
                    break;
            }
        }
        else{
            switch(operation){
                case '+':
                    res = num1 + num2;
                    break;
                case'-':
                    res = num1 - num2;
                    break;
                case'*':
                    res = num1 * num2;
                    break;
                case'/':
                    res = num1 / num2;
                    break;
                case'%':
                    res = (num1 * num2)/100;
                    break;
                default:
                    res = 0;
                    break;
            }
        }
        return res;
    }
}