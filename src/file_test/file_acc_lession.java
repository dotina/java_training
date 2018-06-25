package file_test;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by
 * @author derrick on 30-Dec-17.
 */
public class file_acc_lession {

    // Testing Static initialization block
//    private static int B;
//    private static int H;
//    static {
//        Scanner scB = new Scanner(System.in);
//        Scanner scH = new Scanner(System.in);
//        if (B >=-100 && B<=100)B=scB.nextInt();
//        if (H>=-100 && H<=100)H=scH.nextInt();
//    }

    static Scanner sc = new Scanner(System.in);
    static boolean flag = true;
   private static int B = sc.nextInt();
    private static  int H = sc.nextInt();
    static int area = B * H;
    static {
        try{

            if (B<=0 || H<=0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }else {
                System.out.println(area);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args){
//        String sourceFile = "files/lines.txt";
//        String targetFile = "files/copy_lines.txt";
//
//        try( // this is a try syntax called try with resources. These methods in the brackets implement an interface called autoclosable
//                FileReader fReader = new FileReader(sourceFile);
//                BufferedReader bReader = new BufferedReader(fReader)
//
//                ){
//
//            String line = null;
//            line = bReader.readLine();
//            List str = new ArrayList();
////            line.replaceAll()
//            String data[] = line.split(" ");
//
//            // add items to the list from the data array
//            for (int i = 0; i<data.length; i++){
//                str.add(data[i]);
//            }
//
//
//           System.out.print(str);
//
//
//           // System.out.println("File Copied!!");
//        }catch(Exception e){
//            e.printStackTrace();
//        }



    }

//    static void parallelogram(){
//        if (B>0 && H>0){
//            int area = B * H;
//            System.out.println(area);
//        } else{
//            System.out.println("java.lang.Exception: Breadth and height must be positive");
//        }
//    }

    public static void num_sc_test(){

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127) {
                    System.out.println("* byte");
                }
                if (x>=-32768 && x<=32767){
                    System.out.println("* Short");
                }
                if (x>=-2147483648 && x<=2147483647){
                    System.out.println("* int");
                }
                if ((x >= -9223372036854775808L) && (x <= 9223372036854775807L)){
                    System.out.println("* long");
                }

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }

    }

    public static void sol_sc(){
        Scanner sc = new Scanner(System.in);
        int c = 1;
        String s = null;
        while (sc.hasNext()){
            s = sc.nextLine();
            System.out.println(c+" "+s);
            c++;
        }
    }


}
