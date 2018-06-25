import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by
 * @author derrick on 24-Nov-17.
 */
public class Calc_Client {
    public static void main(String[] args){
//        InetAddress ip = InetAddress.getLocalHost();
//        int Port = 4444;
//        Scanner sc = new Scanner(System.in);
//
////        step 1 open the connection
//        //Socket s = new Socket(ip, Port);
//
//        Date date = new Date();
//        SimpleDateFormat ft = new SimpleDateFormat("E yyyy-MM-dd 'at' hh:mm:ss a z"); // the E in the begging provides the day of the time
//
//        System.out.println("The time is = "+ft.format(date));
//

       // System.out.println(data.math110_res());
        String word = "Hello";

        System.out.println(new StringBuilder(word).reverse().toString()); // one way to reverse a String
        // the other way to reverse a string
        String w = "";
        for (int i=word.length()-1;i>=0; i--){
            w=w+word.charAt(i);
        }
        System.out.println(w);

    }



}
