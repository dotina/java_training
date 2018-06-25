import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by
 * @author derrick on 30-Dec-17.
 * @version 1.0
 */
public class List_arraylist_class {

    public static void main(String[] args){
        List<String> am = new ArrayList<>();
        am.add("jambo");
        am.add("ohfiuad");
        am.add("dickens");

        System.out.println(am);
        am.add("Deno");
        System.out.println(am);

        int pos = am.indexOf("dickens")+1;
        System.out.println("The name is at: "+pos);

        Map<String, String> map = new HashMap<>();

        map.put("d", "the name");
        map.put("c", "curire");

        String l = map.get("c");
        System.out.println("the name is "+l);
        int n = 0;
        for (int i=10; i<100; i++){
            if (isPrime(i)){

                System.out.print(", "+i);
                n++;
            }

            if (n == 7){break;}
        }
        System.out.println("\ncount number is "+n);
    }

    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }

        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%2 == 0){
                return false;
            }
        }
        return true;
    }

}
