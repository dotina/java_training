package java_review_class;


/**
 * Created by
 * @author Derrick on 14-Apr-18.
 */
public class Main {
    public static void main(String[] args){
        RandomNumbers rnm = new RandomNumbers();
       // RandomNumbers.playDice();
        rnm.rollDie();

    }

    public void getGradeBook(){
        int[][] gradeArray = {
                {87,96,70},
                {68,87,90},
                {94,100,90}
        };

        GradeBook myGrade = new GradeBook("The building Class", gradeArray);
        System.out.printf("Welcome to My Grade Book for%n%s%n%n", myGrade.getCourseName());
        myGrade.processGrades();
    }
}
