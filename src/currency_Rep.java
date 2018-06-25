import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by
 * @author derrick on 18-Dec-17.
 */
public class currency_Rep {
    public static void main(String[] args) {
        double val = 0.012;

        double pS = val + val + val;

        System.out.println(pS);

        // the result is not actual
//        so we use BigDecimal
        String strVal = Double.toString(val);
        System.out.println("The String of the Double Value is: "+strVal);
        BigDecimal bigDecimal = new BigDecimal(strVal);
        BigDecimal bSum = bigDecimal.add(bigDecimal).add(bigDecimal);
        System.out.println(bSum);

//        setting your own location recorgnition for number formating
        Locale locale = new Locale("en", "KE");
        long lval = 10_000_000;
        NumberFormat f = NumberFormat.getNumberInstance();
        NumberFormat cur = NumberFormat.getCurrencyInstance(locale);
        String fz = f.format(lval);
        String pesa = cur.format(lval);
        System.out.println(fz+"\n"+pesa);

        System.out.println();
        string_builder sbz = new string_builder();
//        sbz.build_s();
//        sbz.date_time();
//        sbz.convert_to_leters("Dicken");
//        String in1 = sbz.getInput("Enter leo..");
//        String in2 = sbz.getInput("Enter Kesho...");
//        System.out.println(sbz.addV(in1,in2));
        //sbz.client_call();
        sbz.build_s();
    }

}

class string_builder{
       void build_s(){
           String s0 = "Hallo";
           String s1 = "World";

           StringBuilder sb = new StringBuilder("Hallo")
                   .append(", ")
                   .append("World")
                   .append("!");
           System.out.println(sb);
           sb.delete(0, sb.length()); // ending should be the number of characheters - 1

           // adding a two dimenstional array and call its items using the string builder collection
           String[][] states = new String[3][2];
           states[0][0] = "Califonia";
           states[0][1] = "sacremento";
           states[1][0] = "Oregan";
           states[1][1] = "home";
           states[2][0] = "Washington";
           states[2][1] = "Olympia";

//           increment through using and reading using string builder
           for (int i=0;i<states.length; i++){
               StringBuilder sbn = new StringBuilder();
               sbn.append("The Capitial of ")
                       .append(states[i][0])
                       .append(" is ")
                       .append(states[i][1])
                       .append(".");
               System.out.println(sbn);

           }

       }

       void client_call(){
           Scanner sc = new Scanner(System.in);
//           System.out.print("Enter the Value 1: ");
//           double d1 = sc.nextDouble();
//           System.out.println("Enter The second Value: ");
//           double d2 = sc.nextDouble();
//           System.out.println("Enter The second Value: ");
//           double d3 = sc.nextDouble();
           System.out.print("Enter the Value 1: ");
           String in1 = sc.nextLine();
           double d1 = Double.parseDouble(in1);
           System.out.print("Enter the Value 2: ");
           String in2 = sc.nextLine();
           double d2 = Double.parseDouble(in2);
           System.out.print("Enter the Value 3: ");
           String in3 = sc.nextLine();
           double d3 = Double.parseDouble(in3);

           double add = d1+d2+d3;
           System.out.println(Double.toString(add));
       }

       void date_time(){
           LocalDateTime dtl = LocalDateTime.now();
           System.out.println(dtl);

           DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;

       }

       void convert_to_leters(String s){
           char[] c = s.toCharArray();
           for(char l : c){

               System.out.print(l + ", ");
           }
           char mid;
           char first = c[0];
           if ((c.length)%2 != 0){
               int m = (c.length)/2;
               mid = c[m];
           }else{
               mid = '0';
           }

           char last = c[c.length-1];
           System.out.println("\nThe last character is: "+last+"\nthe first is "+first+"\nThe Middle leter is "+mid);
       }

       String getInput(String p){
           System.out.print(p);
           Scanner sc = new Scanner(System.in);
           return sc.nextLine();
       }

       double addV(String v1, String v2){
           double d1 = Double.parseDouble(v1);
           double d2 = Double.parseDouble(v2);

           double res = d1+d2;
           return res;
       }
}
