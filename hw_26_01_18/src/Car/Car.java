package Car;

public class Car {

    protected String brand;
    protected float weight;
    protected float power;

    public Car() {
    }

    public Car(float power) {
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public String setBrand(String brand) {
        this.brand = brand;
        return brand;
    }

    public static void main(String[] args) {

        Lorry truck = new Lorry();
        System.out.println(truck.brand = "Ferrari");
        System.out.println(truck.changeBrand("Volvo"));

    }

    public float changePower (float addPower){
        return power + addPower;
    }
}


