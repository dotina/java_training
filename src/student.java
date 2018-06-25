/**
 * Created by
 * @author derrick on 19-Mar-18.
 */
public class student {
    private Integer id;
   private String name;
   private String attendance;
   private String subject;
   private Integer marks;

    public student(){}

    public student(Integer id, String name, String attendance, String subject) {
        this.id = id;
        this.name = name;
        this.attendance = attendance;
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public String surname(String sname){
        return sname;
    }

    public int num(int n){
        return n;
    }
}
