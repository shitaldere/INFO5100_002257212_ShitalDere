import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class regularExpression {

    public static void main(String[] args) {

        String regExp = "[^jdk]"; //any character except j, d, or k
        String input = "t";

        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(input);

        boolean result = m.matches();
        System.out.println("Result of 1st expression is positive case "+result);
        System.out.println("Result of 1st expression is negative case "+Pattern.matches("[^jdk]","j"));

        //2. matches either he or she
        System.out.println("Result of 2nd expression is negative case "+Pattern.matches("he|she","his"));
        System.out.println("Result of 2nd expression is positive case "+Pattern.matches("he|she","she"));


        //3. First Character should be from H,T,M,L and other range is a to z and length should be 5
        System.out.println("Result of 3rd expression is positive case "+Pattern.matches("[HTML][a-z]{5}","Mangoo"));
        System.out.println("Result of 3rd expression is negative case "+Pattern.matches("[HTML][a-z]{5}","Tango"));


        //4. check if a word
        System.out.println("Result of 4th expression is negative case "+Pattern.matches("\\w","@tv"));
        System.out.println("Result of 4th expression is positive case "+Pattern.matches("\\w","x"));


        //5.check if not a word
        System.out.println("Result of 5th expression is positive case "+Pattern.matches("\\W","%"));
        System.out.println("Result of 5th expression is negative case "+Pattern.matches("\\W","S"));


        //6. Start range from A to U, minimum 3 and maximum 4 characters
        System.out.println("Result of 6th expression is positive case "+Pattern.matches("[A-U]{3,4}","GRAM"));
        System.out.println("Result of 6th expression is negative case "+Pattern.matches("[A-U]{3,4}","GR"));


        //7.any digit in [0-9] range
        System.out.println("Result of 7th expression is positive case "+Pattern.matches("\\d","8"));
        System.out.println("Result of 7th expression is negative case "+Pattern.matches("\\d","l"));


        //8. Match with non whitespace.
        System.out.println("Result of 8th expression is positive case "+Pattern.matches("\\S","P"));
        System.out.println("Result of 8th expression is negative case "+Pattern.matches("\\S"," "));


        //9. using 10 digit phone number with dash
        System.out.println("Result of 9th expression is positive case "+Pattern.matches("[0-9]{3}-?[0-9]{3}-?[0-9]{4}","424-365-2424"));
        System.out.println("Result of 9th expression is negative case "+Pattern.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}","5254-25-5114"));


        //10.require to come more than once
        System.out.println("Result of 10th expression is positive case "+Pattern.matches("[kotlin]+","kkoottlliiinnn"));
        System.out.println("Result of 10th expression is negative case "+Pattern.matches("[kotlin]+","graphics"));
    }
}
