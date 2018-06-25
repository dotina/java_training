/**
 * Created by
 * @author derrick on 23-Nov-17.
 * This program illustrates Varargs and ambiguity
 */
public class args_lesson_overload {
    public static void main(String[] args){
        fun(1,2);
        fun("yess", "no");
        //fun();
    }
//    a method that takes varargs (here integers).
    static void fun(int ... a){
        System.out.print("fun(int ...): number of args: "+a.length+" contents: ");
//        using foreach loop to display content
        for (int x : a){
            System.out.print(x+" ");
        }
        System.out.println();
    }

//    A method that takes varargs (here booleans)
    static void fun(boolean ... a){
        System.out.print("fun(boolean ...): number of args: "+a.length+" contents: ");

//        using foreach loop to display Content
        for (boolean g : a){
            System.out.print(g+" ");
        }
        System.out.println();
    }

//    A method that takes varargs (here booleans)
    static void fun(String ... a){
        System.out.print("fun(String ...): number of args: "+a.length+" contents: ");

//        using foreach loop to display Content
        for (String g : a){
            System.out.print(g+" ");
        }
        System.out.println();
    }
}
