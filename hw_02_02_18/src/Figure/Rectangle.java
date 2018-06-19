package Figure;
import java.util.Objects;

public class Rectangle extends Figure {

    double aSide;
    double bSide;

    public Rectangle(double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.aSide, aSide) == 0 &&
                Double.compare(rectangle.bSide, bSide) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(aSide, bSide);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "aSide=" + aSide +
                ", bSide=" + bSide +
                '}';
    }

    @Override
    public void draw() {
        System.out.print("I am drawing a rectangle! ");
    }

    @Override
    public double square() {
        return aSide * bSide;
    }
}
