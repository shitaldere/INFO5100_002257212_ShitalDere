import java.io.*;

public class Rectangle extends Shape implements Serializable {
    double height;
    double width;

    static String color = "Red";
    static String name= "Rectangle";

    Rectangle(double height, double width) {

        this.height = height;
        this.width = width;

    }


}

