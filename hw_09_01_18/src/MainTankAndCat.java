public class MainTankAndCat {

        public static void main(String[] args) {

            Tank oldTank = new Tank();
            System.out.println("Range: " + oldTank.range() + " km");
            System.out.println("You will need fuel: " + oldTank.fuelNeeded(oldTank.range()) + " liters");
            System.out.println("==============================================");


            Cat badCat = new Cat(30,1,2);
            System.out.println("The POWER is " + badCat.getPower());
    }
}
