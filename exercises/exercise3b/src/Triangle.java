import java.io.Serializable;

public class Triangle extends Shape implements Serializable {
    double base;
    double height;
    double side;

    static String color = "Blue";
    static String name= "Triangle";

    Triangle(double base,double height,double side){

        this.base=base;
        this.height=height;
        this.side = side;

    }
}
