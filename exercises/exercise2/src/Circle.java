public class Circle extends Shape {

     double radius;
     static double pi = 3.14;

    static String color = "Pink";
    static String name= "Circle";


     Circle(double radius,double pi){
         this.radius = radius;
         this.pi = pi;
     }

    @Override
    public double calculateArea() {
        area = pi*radius*radius;
         return area ;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = 2*pi * radius;
        return perimeter;
    }
    public void getVolume(){

    }
}
