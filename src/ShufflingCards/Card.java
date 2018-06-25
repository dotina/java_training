package ShufflingCards;

/**
 * Created by
 * @author Derrick on 20-Apr-18.
 */
public class Card {
    private final String face;
    private final String suit;

    // the constructor initialises the final variables
    Card(String face, String suit){
        this.face = face;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return face + " of " + suit ;
    }
}
