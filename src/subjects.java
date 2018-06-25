import java.util.ArrayList;
import java.util.List;

/**
 * Created by
 * @author derrick on 19-Mar-18.
 */
public class subjects extends student {
    private static List<student> students = new ArrayList<>();

    static {
        students.add(new student(1, "Chao", "On time", "OOP"));
        students.add(new student(1, "Chao", "Late", "Envi 201"));
        students.add(new student(1, "Chao", "On time", "Math 110"));
        students.add(new student(1, "Chao", "Late", "Math 102"));
        students.add(new student(2, "Victor", "", "OOP"));
    }
}
