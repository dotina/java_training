package java_review_class;

/**
 * Created by
 * @author Derrick on 20-Apr-18.
 * This is for learning arrays
 *
 */
public class GradeBook {
    private String courseName; // course names
    private int[][] grades; // array of student grades

    // constructor
    public GradeBook(String courseName, int[][] grades) { // no data validation
        this.courseName = courseName;
        this.grades = grades;
    }

    // setters and getters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int[][] getGrades() {
        return grades;
    }

    public void setGrades(int[][] grades) {
        this.grades = grades;
    }

    // Perform various operations on the data
    public void processGrades(){
        // output grade array
        outputGrades();

        // call method getAverage to calc the average
        System.out.printf("%n%s %d%n%s %d%n%n", "Lowest Grade in the grade Book is: ", getMin(), "Highest grade in the grade bookis: ", getMax());

        // get max & Min
//        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",getMin(),getMax());

        outputBarChart();
    }

    int getMin(){
        int lowGrade = grades[0][0]; // assume that grade[0] is the smallest
//        loop through rows of grades array
        for (int[] sgrade : grades){
//            loop through columns of current row
            for (int grade : sgrade) {
//                if grade less than lowgrade, assign it to lowgrade
                if (grade < lowGrade) {
                    lowGrade = grade; // new lowest grade
                }
            }
        }

        return lowGrade;
    }

    int getMax(){
        int highGrade = grades[0][0]; // assume that the highest grade is at position 0 of the array
        for(int[] s_high:grades){
            for (int high : s_high) {
//                for
                if (high > highGrade) {
                    highGrade = high;
                }
            }
        }
        return highGrade;
    }

    double getAverage(){
        int total = 0;
        // sum grades for one student
        for(int grade:grades){
            total+= grade;
        }
        // return average of the grades
        return (double)total/grades.length; // (size of the array is defined by the .length method
    }

    void outputBarChart(){
        System.out.println("Grade Distribution: ");

        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11]; // eleven elements long

//        for each grade, increment the appropriate frequency
        for(int grade : grades){
            ++frequency[grade/10]; // every grade we divide by ten and that determines which frequency counter should be incremented
        }

        //for each grade frequency, print bar in chart
        for(int count =0; count < frequency.length; count++){
            // output bar label (" 00-09 ", ..., " 90-99 ", "100: ")
            if (count == 10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ", count * 10, count * 10 +9);

            }

            // print bar of asterisks
            for (int stars = 0; stars < frequency[count]; stars++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
// output the contents of the grades array
    void outputGrades(){
        System.out.printf("The Grades are:%n%n");
        // output each student's grade
        for (int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
        }
    }

}
