import java.util.Random;

public class FullTime extends Student {

   int[] examScore = new int[2];

    public FullTime(String s) {
        super(s);
        Random random = new Random();

        examScore[0] = random.nextInt(100);
        examScore[1] = random.nextInt(100);
    }
}
