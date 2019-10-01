import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	String birthdayDate = JOptionPane.showInputDialog("When is your birthday? (e.g. September fourth)");
	if(birthdayDate.equalsIgnoreCase("September thirtieth"))
	{
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Merry UN - Birthday!");
	}
}
}
