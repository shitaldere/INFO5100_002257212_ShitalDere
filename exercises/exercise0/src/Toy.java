
public class Toy {

    String color;
    String name;
    float price;
    String material;
    String size;
    String shape;
    boolean isElectric;
    boolean isEducational;

    public void playing(){

    }
    public void riding(){

    }
    public void repairing(){


    }


   Toy(String material, boolean isElectric){

       this.material = material;
       this.isElectric = isElectric;

       String message;
       if(isElectric) {
           message = " a electric";
       }
         else{
           message="not electric";
       }
       System.out.println("Toy is having a " + this.material + " material and it is " + message + " toy.");
   }


}
