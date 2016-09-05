/**
 * Assignment 3 Question 3: Statistics Application that accepts a set of values
 * 							and calculates the average, standard deviation, and displays
 * 							a histogram of the frequency distribution
 * 
 * Completion time: 45 minutes
 * 
 * @author Jared Gray
 * @version 1.0
 */

package Week3;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class GRAY_A03Q03 {
	static final int MAX_SIZE = 1000;
	static int[] values = new int[MAX_SIZE];
	static double sum = 0, count = 0, standardDeviation = 0, power1 = 0, power2 = 0;
	
	public static void main(String[] args) {
		calculate();
	}
	
	public static void calculate() {
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.##");

		for (int i = 0; i < values.length; i++) {
			System.out.println("Enter a value to plot:");
			values[i] = scan.nextInt();
			
			if (values[i] == 0) { break; }
			count++;
			
			if (values[i] < 0 || values[i] > 10) {
				System.out.println("Invalid input!");
				values[i] = 0;
				count--;
			}
			sum = sum + values[i];
			
			power1 += values[i];
			power2 += Math.pow(values[i], 2);
			standardDeviation = Math.sqrt(i * power2 - Math.pow(power1, 2)) / i;
		}
		double average = sum / count;
		System.out.println("The average is: " + fmt.format(average));
		System.out.println("The Standard Deviation is: " + fmt.format(standardDeviation));
		displayCount(values);
	}
	
	public static void displayCount(int[] array) {
		Arrays.sort(values);
	    int countArray[]=new int[values[values.length-1]+1];
	    for(int i:values){
	       countArray[i]= countArray[i]+1;
	    }
	    for(int i=1;i<10;i++){
	        System.out.println(i + "| " + new String(new char[countArray[i]]).replace("\0", "#"));
	    }
	}
}
