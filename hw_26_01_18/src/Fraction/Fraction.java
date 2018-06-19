package Fraction;

public class Fraction {
    int divident;
    int divisor;

    public Fraction(int divident, int divisor) {
        this.divident = divident;
        this.divisor = divisor;
    }

    public static void main(String[] args) {

    }

    public String printFraction(int devident, int devisor){
        return devident + " / " + devisor;
    }

    public int plusFraction(int plusDivident, int plusDivisor){
        return (divident / divisor) + (plusDivident / plusDivisor);
    }
}

//13 Создайте класс с именем fraction, содержащий два поля типа int - числитель и знаменатель обыкновенной дроби.
//        Конструктор класса должен инициализировать их заданным набором значений.
//        Создайте метод класса, который будет выводить дробь в текстовую строку в формате x / y;
// метод, добавляющий (сложение) к текущей дроби дробь, переданную ему в параметре и возвращающий дробь
// - результат сложения;
//        метод, умножающий (произведение) текущую дробь на число типа double,
//        переданное ему в параметре и возвращающий дробь - результат умножения;
// метод, делящий (деление) текущую дробь на число типа double,
// переданное ему в параметре и возвращающий дробь - результат деления.