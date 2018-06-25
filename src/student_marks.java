/**
 * Created by \
 * @author Derrick on 19-Mar-18.
 */
public class student_marks extends student {
    private int marks;
    private int nb = 23;
    boolean married = true;
    public static void main(String[] args){

        student_marks s = new student_marks();
        System.out.println(s.surname(23));
//        s.married=false;
//        System.out.println(s.surname("dano")+" "+" property of "+s.num(23));
    }


    public int calc_average(){
        return 0;
    }

    public String surname(String sname){
        if (married){
            return " Jimmy";
        }else{
            return super.surname(sname);
        }

    }

    public int surname(int r){
        return r;
    }

    public int num(int n){
        return super.num(n)+nb;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
