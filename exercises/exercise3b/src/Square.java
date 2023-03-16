import java.io.Serializable;

public class Square extends Shape implements Serializable {
    double sides;
    static String color = "Green";
    static String name= "Square";

    Square(double sides){
        this.sides= sides;
    }
}
