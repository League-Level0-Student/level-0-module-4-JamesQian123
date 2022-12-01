package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickelsAsString = JOptionPane.showInputDialog("How much nickels do you have");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int nickels = Integer.parseInt(nickelsAsString);
		double amountOfNickels = nickels*0.05;
		// Ask the user how many dimes they have, and convert their answer
		String dimesAsString = JOptionPane.showInputDialog("How much dimes do you have");
		int dimes = Integer.parseInt(dimesAsString);
		double amountOfDimes = dimes*0.1;
		// Ask the user how many quarters they have, and convert their answer
		String quartersAsString = JOptionPane.showInputDialog("How much quarters do you have");
		int quarters = Integer.parseInt(quartersAsString);
		double amountOfQuarters = quarters*0.25;
				
		// Calculate how much money the user has.  Hint: Use a double variable 
		double amount = amountOfQuarters + amountOfDimes + amountOfNickels;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		System.out.println("$" + amount);
	}
}

