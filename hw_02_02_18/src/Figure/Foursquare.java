package Figure;
import java.util.Objects;

public class Foursquare extends Figure {

    private double aSide;

    public Foursquare(double aSide) {
        this.aSide = aSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Foursquare that = (Foursquare) o;
        return Double.compare(that.aSide, aSide) == 0;
    }

    @Override
    public String toString() {
        return "Foursquare{" +
                "aSide=" + aSide +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(aSide);
    }



    @Override
    public void draw() {
        System.out.print("I am drawing a foursquare! ");
    }

    @Override
    public double square() {
        return aSide * aSide;
    }
}
