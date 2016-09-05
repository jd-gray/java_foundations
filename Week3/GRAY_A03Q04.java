/**
 * Assignment 3 Question 4: Creation of Card and Deck objects to pull cards from deck and display
 * 							the type and value of the card
 * 
 * Completion time: 30 minutes
 * 
 * @author Jared Gray
 * @version 1.0
 */

package Week3;

import java.util.ArrayList;
import java.util.Collections;

public class GRAY_A03Q04 {
	public static class Card {
		private String type, value;
		private int totalCards;

		public Card(String type, String value, int totalCards) {
			this.type = type;
			this.value = value;
			this.totalCards = totalCards;
		}
		
		public String toString() {
			return "\n" + value + " of " + type + "\n" + "Cards remaining: " + totalCards;
		}
	}
	
	public static class Deck {
		ArrayList<Card> cards = new ArrayList<Card>();
		private String[] types = {"Hearts", "Spades", "Diamonds", "Clubs"};
		private String[] values = {"2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King", "Ace"};
		private static int TOTAL_CARDS = 52;
		
		public Deck() {
	        for (int i = 0; i < types.length; i++) {
	            for(int j = 0; j < values.length; j++){
	                this.cards.add(new Card(types[i],values[j], TOTAL_CARDS--));
	            }
	        }
	        shuffleCards(this.cards);
		}
		
		public void shuffleCards(ArrayList<Card> cards) {
			Collections.shuffle(cards);
		}
		
	    public ArrayList<Card> getDeck() {
	        return cards;
	    }		
	}
	
	public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.getDeck());
	}
}
