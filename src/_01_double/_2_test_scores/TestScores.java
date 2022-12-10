package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What is your test score?");
		double scoreAsDouble = Double.parseDouble(score);
		if(scoreAsDouble==100) {
			JOptionPane.showMessageDialog(null, "Wow! A perfect score!! You are very smart");
		}else if(scoreAsDouble>90) {
			JOptionPane.showMessageDialog(null, "Nearly Perfect! Great job!!");
		}else if(scoreAsDouble>80) {
			JOptionPane.showMessageDialog(null, "That's a pretty good score! Good job");
		}else if(scoreAsDouble>70) {
			JOptionPane.showMessageDialog(null, "That's a passing score!!");
		}else if(scoreAsDouble==0) {
			JOptionPane.showMessageDialog(null, "Did you even try??");
		}else if(scoreAsDouble>1) {
			JOptionPane.showMessageDialog(null, "It's alright. You will do better next time.");
		}
	}
}
