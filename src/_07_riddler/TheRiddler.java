package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddleAndAnswer = JOptionPane.showInputDialog( "What has hands but can not clap?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddleAndAnswer.equals("a clock")) {
	score ++;
	JOptionPane.showMessageDialog(null, "Your score is now "+score+" out of 3.");
}
else {
	JOptionPane.showMessageDialog(null, "Wrong. It was a clock.");
}
		// 5. Otherwise, say "wrong" and tell them the answer
String riddleAndAnswer2 = JOptionPane.showInputDialog( "You can drop me from the tallest building and I'll be fine, but if you drop me in water I die. What am I??");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddleAndAnswer2.equals("paper")) {
score ++;
JOptionPane.showMessageDialog(null, "Your score is now "+score+" out of 3.");
}
else {
JOptionPane.showMessageDialog(null, "Wrong. It was paper.");
}
		// 6. Add some more riddles
String riddleAndAnswer3 = JOptionPane.showInputDialog( "Which creature walks on four legs in the morning, two legs in the afternoon, and three legs in the evening?");
//4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddleAndAnswer3.equals("a human")) {
score ++;
JOptionPane.showMessageDialog(null, "Your score is now "+score+" out of 3.");
}
else {
JOptionPane.showMessageDialog(null, "Wrong. It was a human.");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is "+score+" out of 3.");
	}
}

