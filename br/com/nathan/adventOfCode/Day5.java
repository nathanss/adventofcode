package br.com.nathan.adventOfCode;

import adventOfCode.submit.Challenge;
import br.com.nathan.adventOfCode.day5.classes.DefaultRules;
import br.com.nathan.adventOfCode.day5.classes.NewRules;
import br.com.nathan.adventOfCode.day5.classes.NiceStringDetector;
import br.com.nathan.adventOfCode.day5.interfaces.IRule;

public class Day5 implements Challenge {

	@Override
	public String part1(String input) {
		return getResult(input, new DefaultRules());
	}

	@Override
	public String part2(String input) {
		return getResult(input, new NewRules());
	}

	private String getResult(String input, IRule rules) {
		String[] strings = input.split("\n");
		NiceStringDetector nsd = new NiceStringDetector(rules);

		for (String string : strings)
			nsd.addString(string);

		return Integer.toString(
				nsd.numberOfNiceStrings()
		);
	}

}
