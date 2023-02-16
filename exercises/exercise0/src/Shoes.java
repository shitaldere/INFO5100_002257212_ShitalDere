
public class Shoes {

    Double price;
    byte  size;
    String color;
    String material;
    String category;
    boolean isComfortableToWear;
    String brandName;
    String typeOfLace;


    public void tieLace(){


    }
    public void wear (){


    }
    public void washShoes(){


    }

     Shoes(String color,String brandName,String material){
        this.color = color;
        this.brandName=brandName;
        this.material = material;

        System.out.println("The " +this.color + " is shoes color and it's brand name is " + this.brandName + ". It has " + this.material + " material.");

     }




}
