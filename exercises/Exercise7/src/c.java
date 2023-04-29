import java.util.ArrayList;
import java.util.Arrays;

public class c {


   // Input List: {48,56,47,28,96,89};

    public void maxNumber() {

    // Initializing the element
    ArrayList<Integer> myList = new ArrayList<>();
        myList.add(48);
        myList.add(56);
        myList.add(47);
        myList.add(28);
        myList.add(96);
        myList.add(89);
        System.out.println(myList);

        int maximumNumber = myList.get(0);

         // Keeping the length of arraylist in variable
         int capacityOfList = myList.size();

         // loop to find maximum number in list
         for(int i = 1 ; i < capacityOfList ;i++){
         if(myList.get(i)>maximumNumber){
          maximumNumber =myList.get(i);
         }
    }
         System.out.println("Maximum number");
         // showing maximun number
         System.out.println(maximumNumber);

    }
}
