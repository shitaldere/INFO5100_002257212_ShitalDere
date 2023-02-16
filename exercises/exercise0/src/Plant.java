
public class Plant {

    String name;
    String type;
    Float price;
    float height;
    String leavesShape;
    boolean isFlowerPlant;
    String color;
    String needOfSun;



 Plant(String type, String name, float height, String needOfSun) {

    this.type = type;
    this.name=name;
    this.height=height;
    this.needOfSun=needOfSun;

    System.out.println("This is " + this. type + " " + this.name + ". It is " + this.height + " feet tall and this plant require " +this.needOfSun);

 }
    public void giveWater(){

    }

    public void feed(){

    }

    public void cutBranches(){

    }








}
