/**
 * Assignment 3 Question 2: A class to simulate rolling many dice and finding the ratio of snake eyes.
 * 
 * Completion time: 30 minutes
 * 
 * @author Jared Gray and Lewis et al., CST200 team.
 * @version 1.0
 */

package Week3;

public class GRAY_A03Q02 { 
    //Note: you should not need to change the Die class.
    public static class Die {
        private final int MAX = 6;
        private int faceValue;
        
        public Die() {
            faceValue = 1;
        }
        
        public int roll() {
            faceValue = (int)(Math.random() * MAX) + 1;
            return faceValue;
        }
        
        public void setFaceValue(int value) {
            if(value > 0 && value <= MAX)
                faceValue = value;
        }
        
        public int getFaceValue() {
            return faceValue;
        }
        
        public String toString() {
            String result = Integer.toString(faceValue);
            return result;
        }
    }    
    
    public static class PairOfDice {
    	private Die die1, die2;
    	private int sum;
    	
    	public PairOfDice() {
    		// Two Die objects
    		this.die1 = new Die();
    		this.die2 = new Die();
    	}
    	
    	// Getters for Die values
    	public int getDie1() {
    		return die1.getFaceValue();
    	}
    	public int getDie2() {
    		return die2.getFaceValue();
    	}
    	
    	// Setters for Die values
    	public void setDie1(int num) {
    		die1.setFaceValue(num);
    	}
    	public void setDie2(int num) {
    		die2.setFaceValue(num);
    	}
    	
    	public void roll() {
    		die1.roll();
    		die2.roll();
    	}
    	
    	public String toString() {
    		sum = getDie1() + getDie2();
    		return "The current sum of the two die values is " + sum;
    	}
    }

    public static void main(String[] args) {
        final int ROLLS = 500;
        int count = 0;
        
        // Initialize the pair of dice method
        PairOfDice diePair = new PairOfDice();
        
        for(int roll = 1; roll <= ROLLS; roll++){
            // Roll the die pair and count the number of snake eyes.
            // snake eyes occur when both dice roll one.
        	diePair.roll();
			if (diePair.getDie1() == 1 && diePair.getDie2() == 1) {
        		count++;
        	}
        }
        
        System.out.println("Number of rolls: " + ROLLS);
        System.out.println("Number of snake eyes: " + count);
        System.out.println("Ratio: " + (double)count / ROLLS);
    }
}