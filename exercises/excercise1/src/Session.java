import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Session {

    List<Student> studentList = new ArrayList<>(20);
    public Session() {

        String[] names = { "Sagar", "Alex", "Jim", "Robert", "Tim" ,"Jerry", "Tom" ,"Angel" ,"Ram", "Riya",
                           "Kerry", "Dimple", "Shital", "Ryan", "Corey" ,"Bhumi", "Mahir" ,"Hridhaan" ,"Riyansh", "Trisha"};


        for(int i=0; i < 20; i++) {

            if ( i%2 == 0 ) {

                FullTime newFullTimeStudent = new FullTime(names[i]);
                this.studentList.add(newFullTimeStudent);

            } else {

                PartTime newPartTimeStudent = new PartTime(names[i]);
                this.studentList.add(newPartTimeStudent);

            }
        }
    }
    public void printPartTimeStudentsName() {

        System.out.println("Printing list of part-time students");
        for(Student student: studentList) {

            if (student instanceof PartTime) {
                System.out.println(student.name);
            }
        }
    }

    public  void printExamScoreOfFullTimeStudent() {
        System.out.println("Printing exam scores of full-time students");
        for(Student student: studentList) {
            if (student instanceof FullTime) {
                FullTime fullTimeStudent = (FullTime) student;
                System.out.println("Exam scores of Student " + fullTimeStudent.name + " are " + fullTimeStudent.examScore[0] + "," + fullTimeStudent.examScore[1] );
            }
        }
    }

    public double calculateAverageScorePerStudent(ArrayList<Integer> quizScore) {
        int totalScore = 0;
        for(Integer score: quizScore) {
            totalScore =  totalScore + score;
        }
        double averageScore = totalScore / 15;
        return averageScore;
    }

    public ArrayList<Integer> printSortedQuizScore(ArrayList<Integer> quizScore) {

        Collections.sort(quizScore);

        return quizScore;

    }
}
