package exercise6_18;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class exercise6_18 {
	static String errorMessage = "";
	static String password;

	public static void main(String[] args) 
	{
	 String description = "This program checks whether a string entered by the user is a valid password";
	 int option = JOptionPane.YES_OPTION;
    	while (option == JOptionPane.YES_OPTION) {
		try {
			JOptionPane.showMessageDialog(null, description, "Description",
			JOptionPane.INFORMATION_MESSAGE);
			password = JOptionPane.showInputDialog("Please type a password of your choice" + " \n\nHint: \n1.  A password must have at least eight characters.  "
								+ "\n2. A password consists of only letters and digits.  "
								+ "\n3. A password must contain at least two digits. ");

				gePasswordChecked();

				option = JOptionPane.showConfirmDialog(null,
						"Do you want to continue", "Repeat",
						JOptionPane.YES_NO_OPTION);
			} catch (Exception ex) {
				if (ex.getMessage() != null) {
					String outputStr = " Invalid Password: " + ex.getMessage()
							+ "\n\nDo you want to continue? ";
					option = JOptionPane.showConfirmDialog(null, outputStr,
							"Repeat", JOptionPane.YES_NO_OPTION);
				} else {
					String outputStr = " Program execution cancelled"
							+ "\n\nDo you want to continue? ";
					option = JOptionPane.showConfirmDialog(null, outputStr,
							"Repeat", JOptionPane.YES_NO_OPTION);

				}

			}
		}
	}

	private static void gePasswordChecked() throws Exception {

		String checkPassword = isValidPassword(password);
		if (checkPassword == "Invalid Length") {
			errorMessage = "Password must contain at least 8 characters";
			throw new Exception(errorMessage);
		} else if (checkPassword == "Invalid Pattern") {
			errorMessage = "Password can contain only letters and digits";
			throw new Exception(errorMessage);
		} else if (checkPassword == "Invalid Digits") {
			errorMessage = "Password must contain at least 2 digits";
			throw new Exception(errorMessage);
		} else {
			JOptionPane.showMessageDialog(null, "Valid Password", "Result",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	private static String isValidPassword(String password) throws Exception {
		int count = 0;

		if (password.length() < 8) {
			return "Invalid Length";
		} else {
			for (int i = 0; i < password.length(); i++) {

				if (Character.isLetter(password.charAt(i))
						|| Character.isDigit(password.charAt(i))) {
					if (Character.isDigit(password.charAt(i))) {
						count++;
					}
				} else {
					return "Invalid Pattern";
				}
			}

			if (count < 2) {
				return "Invalid Digits";
			}
		}
		return "";
	}

}