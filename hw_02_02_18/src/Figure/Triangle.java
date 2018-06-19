package Figure;
import java.util.Objects;

public class Triangle extends Figure {

    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.aSide, aSide) == 0 &&
                Double.compare(triangle.bSide, bSide) == 0 &&
                Double.compare(triangle.cSide, cSide) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(aSide, bSide, cSide);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "aSide=" + aSide +
                ", bSide=" + bSide +
                ", cSide=" + cSide +
                '}';
    }

    @Override
    public void draw() {
        System.out.print("I am drawing a triangle! ");
    }

    @Override
    public double square() {
        double p = (aSide + bSide + cSide)/2;
        return Math.sqrt(p * (p - aSide) * (p - bSide) * (p - cSide));
    }
}
