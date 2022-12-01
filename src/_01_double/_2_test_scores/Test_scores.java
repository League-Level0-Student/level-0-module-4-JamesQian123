package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test_scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String score = JOptionPane.showInputDialog("What is your most recent test score");
		double scoreAsDoub = Double.parseDouble(score);
		if(scoreAsDoub >= 90) {
			JOptionPane.showMessageDialog(null, "You are so smart");
		}
		else if(scoreAsDoub >= 80 && scoreAsDoub <= 90) {
			JOptionPane.showMessageDialog(null, "Not bad, not bad");
		}
		else if(scoreAsDoub >= 70 && scoreAsDoub <= 80) {
			JOptionPane.showMessageDialog(null, "Your kinda dumb");
		}
		else if(scoreAsDoub >= 60 && scoreAsDoub <= 70) {
			JOptionPane.showMessageDialog(null, "STOP OMG YOUR LITTERLY SO DUMB");
		}
		else {
			JOptionPane.showMessageDialog(null, "OMFG GURLLLL, GIRL BYE, GOODBYE, THERES THE DOOR RIGHT THERE");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
