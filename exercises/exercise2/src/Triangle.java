 class Triangle extends Shape {

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


     public void getVolume(){

     }
  @Override
  public double calculateArea() {
   area = 0.5 * height*base;
           return area;
  }

  @Override
  public double calculatePerimeter() {
    perimeter = base + side + side;
    return perimeter;
  }
 }
