package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Kaveh Kiabi Jan 28, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        String[]suit={"clubs", "pades", "diamonds", "hearts"};
        // Select 7 random card
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(Math.random()*13+1));
            card.setSuit(suit[(int)(Math.random()*4)]);
            hand[i]=card;         
        }
        // Asks the user to guess a card 3 times
        boolean guess=false;
        int counter=1;
        Card card1=new Card();
        do{
            Scanner input=new Scanner(System.in);
            System.out.println("Take a Guess!     Guess number "+counter);
            System.out.println("Enter a type of card  1:clubs 2:pades 3:diamonds 4:hearts :");
            card1.setSuit(suit[input.nextInt()-1]);
            System.out.println("Enter the card number 1 to 10 and J:11 Q:12 K:13 :");
            card1.setValue(input.nextInt());
            for(int i=0; i<7; i++)
                if (card1.compare(hand[i])==0)
                    guess=true;
            
            if(guess)
                // If the guess is successful, invoke the printInfo() method below.
                printInfo();
            else{
                // if the guess is incorrect invokes handAnalyse()and asks for another guess
                System.out.println("Sorry! your guess"+ card1+" was not correct.");
                handAnalyse(hand);
            }
            counter++;
        }while(!guess && counter <= 3);
        System.out.println("This program successfully finished!");
            
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Kaveh Kiabi Jan 2023
     */
    private static void printInfo() {
    
        System.out.println("****Congratulations, you guessed right!****");
        System.out.println();
        
        System.out.println("My name is Kaveh");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Work in a large company like Amazon or Google");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Technology news");
        System.out.println("-- Tv news");
        System.out.println("-- Scocial media/Watching TV");
        System.out.println("-- Palying piano");

        System.out.println();
        
    
    }
    // This method by showing some information about the hand helps the user to guess
   private static void handAnalyse(Card hand[]){
       String[]suit={"Clubs", "Pades", "Diamonds", "Hearts"};
       int suitNum[]= new int[4];
       int suitSum[]= new int[4];
       for(int i=0; i<hand.length;i++){
           for(int j=0;j<4;j++)
                if(hand[i].getSuit().equalsIgnoreCase(suit[j])){
                    suitNum[j]++;
                    suitSum[j]+=hand[i].getValue();
                }
                
       }
       System.out.println("Hint :"); 
       for(int i=0; i<4;i++){
           System.out.printf("%-8s : ",suit[i]);
           System.out.printf("Number:%d  ",suitNum[i]);
           System.out.printf("Sum:%3d",suitSum[i]);
           System.out.println();   
       }
           
}
}
