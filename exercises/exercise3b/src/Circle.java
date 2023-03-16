import java.io.Serializable;

public class Circle extends Shape implements Serializable {
    double radius;
    static double pi = 3.14;

    static String color = "Pink";
    static String name= "Circle";

    Circle(double radius,double pi){
        this.radius = radius;
        this.pi = pi;
    }
}
