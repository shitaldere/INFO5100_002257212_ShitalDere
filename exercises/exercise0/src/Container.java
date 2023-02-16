
public class Container {

   String shape;
   String type;
   String material;
   Float price;
   String size;
   boolean isAirTight;
   boolean isBPAfree;
   String foodTypeHolder;



   public void cleaning() {

   }

   public void closeContainer() {

   }

   public void filling(){

   }

   Container(String type, String shape){

       this.type = type;
       this.shape = shape;

       System.out.println("This is " + this.type + " container and it's in " + this.shape + " shape.");
   }


}
