import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class b {


    int[] collection = {5248, 262, 5478, 2395, 1991, 2002, 1221,859,353};


    int reverse;
    int num;
    int remainder;
    int temp;

    public void palindromeNumber() {

        // palindrome numbers

        for (int i = 0; i < collection.length; i++) {

            System.out.println(collection[i]);

            num = collection[i];
            reverse = 0;
            temp = num;

            while (num > 0) {

                remainder = num % 10;
                reverse = (reverse * 10) + remainder;
                num = num / 10;
            }

            if (temp == reverse) {
                System.out.println("Palindrome number");
            } else {
                System.out.println("Not a palindrome number");
            }

        }
        System.out.println(" ");
        System.out.println("Odd and even numbers");
    }

    //  Odd integer numbers
    public void oddNumbers() {

        for (int i = 0; i < collection.length; i++) {

            System.out.println(collection[i]);

            num = collection[i];

            if (num % 2 == 1) {

                System.out.println("odd numbers ");

            } else {
                System.out.println("Even number");
            }
        }
        System.out.println(" ");
        System.out.println("Prime numbers");
    }
   // prime numbers
    public void primeNumbers() {

        for (int i = 0; i < collection.length; i++) {

            System.out.println(collection[i]);

            num = collection[i];
            int count = 0;

            if (num > 1) {
                for (int j = 1; j <= num; j++) {
                    if (num % j == 0)
                        count++;
                }
                if (count == 2) {
                    System.out.println("Prime number");
                } else {
                    System.out.println("Not Prime number");
                }


            }
        }
    }
}