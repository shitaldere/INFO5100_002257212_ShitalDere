
public class Cloth {

    String size;
   String material;
    String color;
    String type;
    String brand;
    double cost;
    boolean isZipless;
    String structure;

    public void takeOff() {

    }

    public void change() {

    }

    public void press() {

    }
    Cloth(String brand, String size ,String structure){

        this.brand = brand;
        this.size = size;
        this.structure = structure;

        System.out.println("The brand is " + this.brand + ". Its size is " +this. size + " and it has " + this. structure+ " structure.");

    }

}
