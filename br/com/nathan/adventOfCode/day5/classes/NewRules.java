package br.com.nathan.adventOfCode.day5.classes;

import br.com.nathan.adventOfCode.day5.interfaces.IRule;

public class NewRules implements IRule {

	@Override
	public boolean eval(String word) {
		String caseInsensitiveWord = word.toLowerCase();
		return hasARepeatingPair(caseInsensitiveWord) && hasAMirror(caseInsensitiveWord);
	}

	private boolean hasARepeatingPair(String word) {
		for (int i = 0; i < word.length() - 2; i++) {
			String pair = word.substring(i, i + 2);
			String rest = word.substring(i + 2, word.length());
			if (rest.contains(pair))
				return true;
		}
		return false;
	}

	private boolean hasAMirror(String word) {
		char[] array = word.toCharArray();
		for (int i = 0; i< array.length - 2; i++)
			if (array[i] == array[i+2]) return true;

		return false;
	}

}
