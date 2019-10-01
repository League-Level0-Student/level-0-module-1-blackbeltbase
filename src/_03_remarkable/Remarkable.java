package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Say something remarkable about each person in a variable.
String remarkableTrait1 = "penmanship.";
String remarkableTrait2 = "drawing.";
String remarkableTrait3 = "smiling.";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String user1 = JOptionPane.showInputDialog("What is your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if(user1.equalsIgnoreCase("Bob"))
{
	JOptionPane.showMessageDialog(null, user1 +" is remarkable at " + remarkableTrait1);
}
else if(user1.equalsIgnoreCase("Joe"))
{
	JOptionPane.showMessageDialog(null, user1 +" is remarkable at " + remarkableTrait2);
}
else if(user1.equalsIgnoreCase("Pete"))
{
	JOptionPane.showMessageDialog(null, user1 +" is remarkable at " + remarkableTrait3);
}
else
{
	JOptionPane.showMessageDialog(null, user1 +" is remarkable.");
}
	}
}

