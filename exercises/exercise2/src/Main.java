public class Main {

  public static void main(String[] args) {

    Shape sha1 = new Rectangle(15.5,13.2); // upcasting
    System.out.println("Area of rectangle " + sha1.calculateArea());
    System.out.println("perimeter of rectangle " + sha1.calculatePerimeter());
    System.out.println("color of rectangle " + Rectangle.color);
    System.out.println("name of rectangle " + Rectangle.name);

    Rectangle r = new Rectangle(15.5, 34.3);
    r.draw();
    r.draw("Special drawing for Shital");// compile time polymorphism


    Shape r1 = new Rectangle(15.5,13.2);
    System.out.println("color of rectangle " + Rectangle.color);
    System.out.println("name of rectangle " + Rectangle.name);

    Shape shape2 = new Square(20);
    System.out.println("Area of square " + shape2.calculateArea());
    System.out.println("perimeter of square " + shape2.calculatePerimeter());
    System.out.println("color of Square " + Square.color);
    System.out.println("name of Square " + Square.name);

    Shape sq2 = new Square(20);
    System.out.println("color of Square " + Square.color);
    System.out.println("name of Square " + Square.name);


    Shape shape3 = new Triangle(12,17,26);
    System.out.println("Area of triangle " + shape3.calculateArea());
    System.out.println("perimeter of triangle " + shape3.calculatePerimeter());
    System.out.println("color of Triangle " + Triangle.color);
    System.out.println("name of Triangle " + Triangle.name);

    Shape shape4 = new Circle(5,Circle.pi);
    System.out.println("Area of circle " + shape4.calculateArea());
    System.out.println("perimeter of circle " + shape4.calculatePerimeter());
    System.out.println("color of Circle " + Circle.color);
    System.out.println("name of Circle " + Circle.name);

  }
}