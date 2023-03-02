
public class Rectangle extends Shape {
    double height;
    double width;

    static String color = "Red";
    static String name= "Rectangle";


    public void getVolume(){

    }
    Rectangle(double height, double width) {

        this.height = height;
        this.width = width;

    }

    @Override
    public double calculateArea() {

        area = height * width;
        return area;
    }

    @Override
    public double calculatePerimeter() {

        perimeter = 2 * (height + width);
        return perimeter;
    }

    public void draw() {
        System.out.println("Drawing plain Rectangle");
    }


    public void draw(String message) {
        System.out.println("Drawing Rectangle with message " + message);
    }


}