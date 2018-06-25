package java_review_class;

import java.security.SecureRandom;



/**
 * Created by
 * @author Derrick on 18-Apr-18.
 */
public class RandomNumbers{


    private static final SecureRandom random = new SecureRandom();

    // enum type with constants that represent the game status
    private enum Status{CONTINUE, WON, LOST};

    //constants that represent common rolls of a dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;



    void secureRandom(){

        for(int counter = 1; counter<=20; counter++){
            // pick random integers from 1 to 6
            int r = 1+random.nextInt(100);
            System.out.printf("%d ",r);

            // start a new line when the counter reaches 5
            if (counter%5 == 0)
                System.out.println();
        }
    }

    void rollDie(){
        // this is a six sided die make an array
        int[] side = new int[6];

        // tally counts for 6,000,000 rolls of a die
        for(int roll=1; roll<=6000000; roll++){

            ++side[random.nextInt(6)];
        }
        System.out.printf( "%s%10s%n","Face", "Frequency");
//        output
        for (int f=0; f<side.length;f++) {
            System.out.printf("%4d%10d%n", f+1, side[f] );
        }
    }

    static int rollDice(){
        // pick random die values
        int die1 = 1+random.nextInt(6);
        int die2 = 1+random.nextInt(6);

        int sum = die1+die2;
        // display results of this roll
        System.out.printf("Player Rolled %d + %d = %d%n",die1,die2,sum);

        return sum;
    }

    static void playDice(){
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus;

        int sumOfDice = rollDice();

        // determine game status and point based on first roll
        switch (sumOfDice){
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is  %d%n", myPoint);
                break;
        }

        //while game is not complete
        while(gameStatus == Status.CONTINUE){ // not win or lost
            sumOfDice = rollDice(); // roll dice again

            // determine game status
            if (sumOfDice == myPoint){ // win by making point equal to roll
                gameStatus = Status.WON;
            }else if (sumOfDice == SEVEN){// lose by rolling seven before points
                gameStatus = Status.LOST;
            }
        }

        // display WON or LOST Message
        if (gameStatus == Status.WON){
            System.out.println("Player Wins");
        }else{
            System.out.println("Player Loses");
        }

    }
}
