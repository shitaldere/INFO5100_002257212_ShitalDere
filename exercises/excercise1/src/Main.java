import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Session session = new Session();

        session.printPartTimeStudentsName();

        System.out.println("\n");

        session.printExamScoreOfFullTimeStudent();

        System.out.println("\n");


        for( int i = 0; i < 20; i++) {

            Student currentStudent = session.studentList.get(i);

            double averageScore = session.calculateAverageScorePerStudent(currentStudent.quizScore);
            System.out.println("Average Score of Student " + currentStudent.name + " is " + averageScore);

            ArrayList<Integer> sortedQuizScore = session.printSortedQuizScore(currentStudent.quizScore);
            System.out.println("Sorted quiz Scores of Student " + currentStudent.name + " are " + sortedQuizScore);

            System.out.println("\n");

        }






    }

}
