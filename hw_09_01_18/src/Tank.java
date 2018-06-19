public class Tank {

    private String name = "Tiger";

    private int crew = 4; //экипаж
    private int shell = 40; //снарядов
    private int weight = 40000; //вес в кг.
    private int power = 700; // мощность в л.с.
    private int speeed = 45; //средняя скорость в км.
    private double fuelcap = 1270; //емкость бака в л.
    private double lKm = 200; // расход л. на 100 км.

    private boolean isRefueled; //заправлен
    private boolean isCharged; //заряжен
    private boolean isRepaired; //исправлен

    public double range(){
        return fuelcap * 100/lKm;
    }
    public double fuelNeeded(double km){
    return km * lKm/100;
    }

}
