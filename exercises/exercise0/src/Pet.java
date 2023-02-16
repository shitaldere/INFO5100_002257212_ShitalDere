
public class Pet {

    String name;
    String color;
    byte weight;
    String type;
    boolean isFriendly;
    boolean isVegeterian;
    byte numberOfMeal;
    double price;

    public void feedingPet(){


    }
    public void washingPet(){


    }
    public void walking(){


    }

    Pet(String color, double price){
        this.color=color;
        this.price = price;

        System.out.println("My pet color is " + this.color + " and it's cost is " + this.price + " dollars.");

    }





}
