import java.io.*;

public class Program {

    public static void main(String[] args) {

        try{
            Rectangle sha1 = new Rectangle(15,13); // objects creation -1
            Rectangle r = new Rectangle(20,12);    //2
            Shape r1 = new Rectangle(5.5,2.2);     //3
            Shape shape2 = new Square(18);                //4
            Shape sq2 = new Square(14);                   //5
            Shape shape3 = new Triangle(10,5,4);//6
            Shape shape4 = new Circle(8,Circle.pi);       //7


            FileOutputStream fileOut = new FileOutputStream("Shape.ser"); //Serialization process
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);        //Serialization process
            objOut.writeObject(sha1);    //Serialization method for 1st object
            objOut.writeObject(r);      //2nd object
            objOut.writeObject(r1);     //3rd object
            objOut.writeObject(shape2); //4th object
            objOut.writeObject(sq2);    //5th object
            objOut.writeObject(shape3); //6th object
            objOut.writeObject(shape4); //7th object
            objOut.flush();
            objOut.close();     // Serialization finish
            System.out.println("Serialization Successful ");


            System.out.println("Data after deserialization process is as below :");

            FileInputStream fileIn = new FileInputStream("Shape.ser");//Deserialization process
            ObjectInputStream objIn = new ObjectInputStream(fileIn);        //Deserialization process

            Rectangle react = (Rectangle)objIn.readObject();//Deserialization method for 1 st object
            System.out.println("Reactangle height is " +react.height + " and width is " +react.width );

            Rectangle rr = (Rectangle)objIn.readObject();//2
            System.out.println("Reactangle height is " +rr.height + " and width is " +rr.width );

            Rectangle rect =(Rectangle)objIn.readObject();//3
            System.out.println("Reactangle height is " +rect.height + " and width is " +rect.width );

            Square sqr = (Square)objIn.readObject();//4
            System.out.println("Square sides are " + sqr.sides);

            Square square = (Square)objIn.readObject();//5
            System.out.println("Square sides are " + square.sides);

            Triangle tri = (Triangle)objIn.readObject();//6
            System.out.println("Triangle base is "+tri.base + " height is " + tri.height + " side is " +tri.side);

            Circle cr = (Circle)objIn.readObject();//7
            System.out.println("Circle radius is " + cr.radius +" and pi is  "+ Circle.pi);

            objIn.close();

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}




