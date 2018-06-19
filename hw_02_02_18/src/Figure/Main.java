package Figure;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3,4,5);
        triangle.draw();
        System.out.println("Square: " + triangle.square());

        Foursquare foursquare = new Foursquare(4);
        foursquare.draw();
        System.out.println("Square: " + foursquare.square());

        Rectangle rectangle = new Rectangle(3,4);
        rectangle.draw();
        System.out.println("Square: " + rectangle.square());

        Circle circle = new Circle(17);
        circle.draw();
        System.out.println("Square: " + circle.square());
    }
}
