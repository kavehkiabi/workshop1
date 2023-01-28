package exercise1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author dancye
 * @author Paul Bonenfant May 2020
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }  
    public String toString(){
        return String.format("%-2d %-6S",value, suit);
    }
    public int compare(Card card){
        /*
        This method compares two cards and returns an integer value
        0 if two cards are the same
        1 if the suits are equal but the value is bigger
        -1 if the suit are equal but the value is lower
        -2 if the suits are different
        */
        if(suit.equals(card.getSuit()))
            return -2;
        else if(value==card.getValue())
            return 0;
        else if(value>card.getValue())
            return 1;
        else
            return -1;
        
    }
    
}
