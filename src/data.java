import java.util.Scanner;

/**
 * Created by
 * @author derrick on 28-Mar-18.
 */
public class data implements myData{
    private int age = 24;
    private String name = "dickens";

    @Override
    public int dividemyage() {
        Scanner sc = new Scanner(System.in);
        int div=0;
        try{
            System.out.print("Enter number the age should be divided by... ");
            int num = sc.nextInt();
            div = age/num;
        }catch (Exception e){
            System.out.println("The value entered is a zero and it is not a valid divisor!!!");
        }
        return div;
    }

    public data(int a, String n) {
        this.age = a;
        this.name = n;
    }

    public data(){}

    public static int triplemyage(){
        data d = new data();
        int trippleAge = d.age*3;
        if (trippleAge>150){
            throw new ArithmeticException("The age is greater than 150");
        }
        return trippleAge;
    }

    public static int halfmytripleage(){
       int halfVal = 0;
        try{
            halfVal = triplemyage()/2;
        }catch (Exception e){
            e.printStackTrace();
        }
        return halfVal;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args){
//        data d = new data(24, "Dickens");
//        System.out.println("My name is " + d.name+ " and my age is "+d.age+", tripled my age will be "+ triplemyage() +" and half of my tripled age is "+halfmytripleage());

      System.out.println( math110_res());

    }

    static int math110_avarage(int [] x){
        int math110_sum=0;
        for(int i=0; i < x.length ; i++) {
            math110_sum = math110_sum + x[i];
        }
        //calculate average value
        int average = math110_sum / x.length;
        return average;
    }



    static void math110_results(String[] x, int [] y){
        System.out.println("No.  |\tName of DLM student  |\tMath110 Marks");
        for(int i=0; i<x.length; i++){

            System.out.printf("%d\t\t%s\t\t\t\t\t%d\n", i+1,x[i],y[i]);
        }
    }

    static String math110_res(){
        double opp_sum=0.0;
        double envi_sum=0.0;
        double math110_sum=0.0;
        double math102_sum=0.0;
        String[] students = new String[]{"Chao", "Victor", "Mary", "Kamau", "Abdi"};
        int [] opp_result = new int[]{20,21,27,28,18};
        int [] envi201_result = new int[]{23,10,15,29,26};
        int [] math110_result = new int[]{22,27,20,28,22};
        int [] math102_result = new int[]{23,24,22,23,10};
        String [] opp = new String[]{"ontime", "ontime", "late", "late", "ontime"};
        String [] envi201 = new String[]{"late", "ontime", "late", "late", "ontime"};
        String [] math110 = new String[]{"ontime", "ontime", "ontime", "ontime", "ontime"};
        String [] math102 = new String[]{"late", "ontime", "late", "ontime", "ontime"};

        math110_results(students, math110_result);

       return "The avarage is: " + math110_avarage(math110_result);
    }
}
