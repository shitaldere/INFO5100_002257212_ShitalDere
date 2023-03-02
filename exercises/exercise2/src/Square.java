
public class Square extends Shape {

    double sides;
    static String color = "Green";
    static String name= "Square";

    Square(double sides){
        this.sides= sides;
    }

    @Override
    public double calculateArea() {

        area = sides * sides;
        return area;
    }

    @Override
    public double calculatePerimeter() {

        perimeter = 4* sides;
        return perimeter;
    }
    public void getVolume(){

    }
}
