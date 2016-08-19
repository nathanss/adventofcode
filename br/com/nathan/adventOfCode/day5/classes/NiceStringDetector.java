package br.com.nathan.adventOfCode.day5.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import br.com.nathan.adventOfCode.day5.interfaces.IRule;

public class NiceStringDetector {

	public List<String> strings;
	private IRule rules;

	public NiceStringDetector(IRule rules) {
		this.strings = new ArrayList<>();
		this.rules = rules;
	}

	public int numberOfNiceStrings() {
		int n = 0;
		for (String string : strings) {
			if (rules.eval(string)) n++;
		}
		return n;
	}

	public void addString(String string) {
		this.strings.add(string);
	}
}
