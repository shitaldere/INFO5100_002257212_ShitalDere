
public class Backpack {

    String type;
    String color;
    String material;
    double cost;

    int numberOfPockets;
    int numberOfZip;
    String shape;
    String serialNumber;


    public void travelling() {

    }

    public void packing() {

    }

    public void fastenZipper() {

    }
   Backpack(double cost,String shape ){

       this.cost = cost;
       this.shape = shape;

       System.out.println("The cost of this branded backpack is " + this.cost + " dollars and this backpack comes in " +this.shape + " shape.");

   }


}
