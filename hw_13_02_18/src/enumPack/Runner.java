package enumPack;

public class Runner {
    public static void main(String[] args) {

        for (PublicTransport t : PublicTransport.values()) {
            System.out.println(t);
        }

        PublicTransport trans = PublicTransport.SHUTTLEBUS;

        double price = 0;

        switch (trans){
            case BUS : price = 5;
            break;
            case METRO : price = 3;
            break;
            case SHUTTLEBUS : price = 6;
            break;
            case TRAM : price = 3;
            break;
            case TROLLEYBUS : price = 3;
            break;
        }
        System.out.println("\nPrice for the " + trans.name() + " = " + price);
    }
}