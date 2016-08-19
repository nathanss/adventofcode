package br.com.nathan.adventOfCode;

import adventOfCode.submit.Challenge;
import br.com.nathan.adventOfCode.day6.classes.House;
import br.com.nathan.adventOfCode.day6.classes.Light;
import br.com.nathan.adventOfCode.day6.classes.NewLight;
import br.com.nathan.adventOfCode.day7.classes.Circuit;
import br.com.nathan.adventOfCode.day7.classes.SignalCreator;

public class Day7 implements Challenge {

	@Override
	public String part1(String input) {
		Circuit circuit = new Circuit(input, new SignalCreator());
		return Integer.toString(
					circuit.getValueFor("a")
				);

	}

	@Override
	public String part2(String input) {
		Circuit circuit = new Circuit(input, new SignalCreator());
		circuit.loadSignal( circuit.getValueFor("a") + " -> b");
		circuit.recalculate();
		return Integer.toString(
					circuit.getValueFor("a")
				);
				
	}



}
