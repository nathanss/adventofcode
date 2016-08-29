package br.com.nathan.adventOfCode;

import adventOfCode.submit.Challenge;
import br.com.nathan.adventOfCode.day8.classes.SantaList;

public class Day8 implements Challenge{

	@Override
	public String part1(String input) {
		SantaList santaList = new SantaList(input);
		return Integer.toString(
					santaList.getLiteralSize() - santaList.getInMemorySize()		
		);
	}

	@Override
	public String part2(String input) {
		
		
		return null;
	}

}
