package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String num1 = JOptionPane.showInputDialog("Give me a number");
		int num1AsInt = Integer.parseInt(num1);
		String num2 = JOptionPane.showInputDialog("Give me another number");
		int num2AsInt = Integer.parseInt(num2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Button1", "Button2", "Button3", "Button3" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
		static void add(int num1AsInt, int num2AsInt ) {
			String  num3 = "num1AsInt + num2AsInt";
			int num3AsInt = Integer.parseInt(num3);
			JOptionPane.showMessageDialog(null, "num1AsInt + num2AsInt = num3AsInt ");
		}
	// 4. Create similar methods for subtraction, multiplication and division.
}