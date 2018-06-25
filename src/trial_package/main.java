package trial_package;

import java.util.Scanner;

/**
 * Created by
 * @author Derrick on 16-Jun-18.
 * For prompt check on items
 */
public class main {
    public static void main(String[] args){
        boolean isVowel = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character...");

        char c = sc.next().charAt(0);
        sc.close();

        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel = true;
        }

        if (isVowel == true){
            System.out.println(c+"is a vowel");
        }else{
            if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                System.out.println("This is a constant");
            }else {
                System.out.println("Enter an alphabet");
            }
        }
    }
}
