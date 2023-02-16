
public class Furniture {

    String type;
    String name;
    String serialNumber;
    String shape;
    double cost;
    String brand;
    boolean isWooden;
    boolean isUsed;

    public void move() {

    }

    public void seatOnFurniture() {

    }

    public void putThings(){

    }

    Furniture(String type, boolean isUsed, String serialNumber){

        this.type=type;
        this.isUsed=isUsed;
        this. serialNumber= serialNumber;

        String usedMessage;

        if (isUsed) {
            usedMessage = "Used";
        } else {
            usedMessage = "New";
        }

        System.out.println(this.type+ " is a type of furniture, that is  " +usedMessage + " and the serial number of the furniture is " + this.serialNumber);

    }



}
