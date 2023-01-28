package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        String[]suit={"clubs", "pades", "diamonds", "hearts"};
        //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(Math.random()*13+1));
            card.setSuit(suit[(int)(Math.random()*4)]);
            hand[i]=card;
            System.out.println("  "+hand[i]);
            
            
            
            
        }
        boolean guess=false;
        int counter=1;
        Card card1=new Card();
        do{
            Scanner input=new Scanner(System.in);
            System.out.println("Please guess a type of card  1:clubs 2:pades 3:diamonds 4:hearts :");
            card1.setSuit(suit[input.nextInt()-1]);
            System.out.println("Enter the card number 1 to 10 and J:11 Q:12 K:13 :");
            card1.setValue(input.nextInt());
            for(int i=0; i<7; i++){
                System.out.println(hand[i] +"  "+ card1);
                int result=card1.compare(hand[i]);
                System.out.println(result);
                if (result==0)
                    guess=true;
            }
                    
            if(guess)
                printInfo();
            else
                System.out.println("Sorry! may be next time.");
            System.out.println("Your choice was "+ card1);
            counter++;
        }while(!guess || counter < 5);
        
        
            
                    
        

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
