public class Cat {

    private String name;
    private String color;
    private double weight;
    private double height;
    private double length;
    private double power;

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Cat(double weight, double height, double length) {
        this.weight = weight;
        this.height = height;
        this.length = length;
    }

//
//    public double power (double w, double h, double l){
//        double res = w * h * l;
//        return res;
//    }

}
