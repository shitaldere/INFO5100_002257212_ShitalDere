
public class Gym {

    String gymName;

    int gymFloor;
    String machineryName;
    double openHours;
    byte numberOfMachinery;
    double subscriptionCost;
    boolean trainerInclude;
    String machineryMaterial;
    String exerciseType;

    class Spa {
        String uses="get spa facility";

       public void displayUse(){
           System.out.println(uses);
       }

    }

    class Pool {

    }

    public void running() {

    }

    public void walking() {

    }
    public void weightTraining(){


    }

    Gym(String gymName, int totalFloor, double openHours ){

     this.gymName  =gymName;
     this.gymFloor = totalFloor;
     this.openHours = openHours ;

     System.out.println(this.gymName+ " is a famous gym in the State which has " + this.gymFloor+ " floors and open for "+ this.openHours + " hours.");
    }

}
