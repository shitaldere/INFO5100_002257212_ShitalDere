package Question;
import java.util.Arrays;
import java.util.List;

public class a {



    public void swapNumbers(int index1,int index2) {
        int[] myArray = {1, 2, 3, 40, 5, 6}; // Array declaration
        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            if (i == index2) {

                int temp = myArray[index1];  // fitting value in temporary variable
                myArray[index1] =myArray [index2];
                myArray[index2] = temp;

                System.out.println("After exchanging position of elements");
                System.out.println(Arrays.toString(myArray)); // After swapping elements
            }


        }


    }}
