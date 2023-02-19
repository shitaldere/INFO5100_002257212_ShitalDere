import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {

    ArrayList<Integer> quizScore = new ArrayList<>(15);
    String name;

    public Student(String name) {

        this.name = name;

        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            quizScore.add(random.nextInt(100));
        }
    }
}
