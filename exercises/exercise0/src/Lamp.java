
public class Lamp {

    String type;
    String bulbColor;
    double height;
    String lightIntensity;
    boolean workOnAlexa;
    String lampCover;
    int bulbNumbers;
    String shape;



    public void onTheLamp() {

    }

    public void raiseBrightness() {

    }

    public void changeBulb() {

    }
   Lamp(String lampCover, int bulbNumbers,double height){
        this.lampCover = lampCover;
        this.bulbNumbers =bulbNumbers;
        this.height = height;

      System.out.println("This lamp has " + this.lampCover + "cover. The lamp ha s" + this.bulbNumbers + " bulbs and it is " +this.height + " feet tall");


   }

}
