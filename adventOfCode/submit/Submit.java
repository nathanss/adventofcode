package adventOfCode.submit;

import javax.swing.JOptionPane;

public class Submit {

	public static void main(String[] args) throws Exception {
		while(true){
			String userChoice = null;
			for(boolean valid = false;valid==false;){
				userChoice = JOptionPane.showInputDialog("Enter challenge number (1-25)"
						+ "\nNot a number exits application");
				try{
					Integer.parseInt(userChoice);
					valid = true;
				}catch(NumberFormatException e){
					if(userChoice == null || !userChoice.isEmpty())
						return;
				}//
			}
			String path = "inputs/day"+userChoice+".txt";
			String input = new PuzzleInput(path).getInOneLine();
			Challenge day = new ChallengeFactory().create(userChoice);
			String answer = "Part1: "+day.part1(input)+"\nPart2: "+ day.part2(input);
			JOptionPane.showMessageDialog(null, answer);
		}
	}

}
