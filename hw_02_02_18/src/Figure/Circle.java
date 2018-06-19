package Figure;
import java.util.Objects;

public class Circle extends Figure{

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(r);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }


    @Override
    public void draw() {
        System.out.print("I am drawing a circle! ");
    }

    @Override
    public double square() {
        final double pi = 3.14;
        return pi * (r * r);
    }
}
