package ShufflingCards;

import java.security.SecureRandom;

/**
 * Created by
 * @author Derrick on 20-Apr-18.
 */
public class DeckOfCards {
    private Card[] deck;
    private int currentCard; // index of cards to be dealt are [0-51]
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumbers = new SecureRandom(); // random number generator object

    DeckOfCards(){
     String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "King", "Queen"};
     String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

     deck = new Card[NUMBER_OF_CARDS]; // initialise the array
        currentCard = 0; // first card dealt will be deck[0]
        // populate deck with Card Objects
        for (int count=0; count< deck.length; count++){
            // we are looping through every element in the deck Card object creating a new object that fills elements in the array
            deck[count] = new Card(faces[count%13], suits[count/13]); // we assign to the current element
        }
    }

    // shuffle the deck of cards with one-pass algorithm
    public void shuffle(){
        currentCard = 0;

        for (int first = 0; first<deck.length; first++){
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard(){
        // determine whether Cards remain to be dealt
        if (currentCard<deck.length){
            return deck[currentCard++];
        }else {
            return null;
        }
    }
}
