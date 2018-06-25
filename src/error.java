import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by
 * @author Derrick Dickens Otina on 11-Mar-18.
 * Assignment 1
 */
public class error {
    public static void main(String args[]){ // arg was wrong as a command line will return arguments and not an argument
//        System.out.println("I am an honest student"); // it should not be Systems as their is no class named Systems
//        System.out.println("I am now going to count up to 10 but exclude even numbers"); // corrected Systems to System as their is no class called Systems
//
//        for (int i=1; i<10; i++){ // corrected the i as it was not declared to which type of variable,
//            // and we are comparing the assigned value to the variable i and not the value 1 against 10,
//            // the incrementation of i is not complete it should not be i+ but i++ to indicate incrementing
//            if (i%2==0){ // if the aim is to get all possible even numbers between 1 and 10 the we have to use the modulus to compute the remainder against 0.
//                // we cant use / as it returns the results of a division while we need the remainder after a division done.
//                System.out.print(i+" "); // we use + to concatenate two statements
//            }
//        }
//        System.out.println();
//        loop(11);
        count_words_frm_file();



    }

    public static void count_words_frm_file(){
        String sourceFile = "files/lines.txt"; // this is the directory location of the file

        try( // this is a try syntax called try with resources. These methods in the brackets implement an interface called autoclosable
             FileReader fReader = new FileReader(sourceFile);
             BufferedReader bReader = new BufferedReader(fReader)

        ){
            String words = bReader.readLine();

            if (words == null || words.isEmpty()){
                System.out.println(" file empty");
            }

            String word[] = words.split("\\s+");

           System.out.print(word.length);

        }catch(Exception e){
            e.printStackTrace();
        }
    }



    public static void loop(int a){

        if (a>10){
            System.out.println("Wrong entry it should be less than 10");
        }
        while (a<10){
            break;
        }
    }

    public static void count_nums_frm_file(){
        String sourceFile = "files/lines.txt"; // this is the directory location of the file

        try( // this is a try syntax called try with resources. These methods in the brackets implement an interface called autoclosable
             FileReader fReader = new FileReader(sourceFile);
             BufferedReader bReader = new BufferedReader(fReader)

        ){
            String txt = bReader.readLine();

            //System.out.print(txt);

            String nums = txt.replaceAll("[^-?0-9]+", " "); // This gets only numbers

            Scanner sc = new Scanner(nums); // this sends as an input so that i can get items only

            List<Integer> list = new ArrayList<>();// interger list of the items
            while (sc.hasNext()){
                list.add(sc.nextInt());
            }

            //System.out.println(list);

            Iterator<Integer> iter = list.iterator();
            while (iter.hasNext()){
                int num = iter.next();
                if (num%2!=0)iter.remove();// this removes those items that are not even
            }

            System.out.print(list.toString().replace("[", "").replace("]", ""));

        }catch(Exception e){
            e.printStackTrace();
        }
    }


}

