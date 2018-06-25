package ShufflingCards;

/**
 * Created by
 * @author Derrick on 20-Apr-18.
 */
public class Main {
    public static void main(String[] args){
        DeckOfCards mCards = new DeckOfCards();
        mCards.shuffle();

        // print all 52 cards in order they are dealt
        for (int i=1; i<=52; i++){
            // deal and display a card
            System.out.printf("%-19s", mCards.dealCard()); // when you output a string of an object java will call the objects toString method.
            if (i%4 == 0){ // create a new line every time the fourth card is reached.
                System.out.println();
            }
        }
    }
}
