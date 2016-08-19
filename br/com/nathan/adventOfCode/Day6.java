package br.com.nathan.adventOfCode;

import adventOfCode.submit.Challenge;
import br.com.nathan.adventOfCode.day6.classes.House;
import br.com.nathan.adventOfCode.day6.classes.Light;
import br.com.nathan.adventOfCode.day6.classes.NewLight;

public class Day6 implements Challenge {

	@Override
	public String part1(String input) {
		House house = new House(1000, 1000, new Light());
		String[] instructions = input.split("\n");
		house.loadInstructions(instructions);
		return Integer.toString(
				house.getNumberOfTurnedOnLights()
		);

	}

	@Override
	public String part2(String input) {
		House house = new House(1000, 1000, new NewLight());
		String[] instructions = input.split("\n");
		house.loadInstructions(instructions);
		return Integer.toString(
				house.getTotalBrightness()
		);
	}



}
