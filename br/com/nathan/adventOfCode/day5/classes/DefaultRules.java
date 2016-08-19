package br.com.nathan.adventOfCode.day5.classes;

import br.com.nathan.adventOfCode.day5.interfaces.IRule;

public class DefaultRules implements IRule {

	@Override
	public boolean eval(String word) {

		String caseInsensitiveWord = word.toLowerCase();
		char[] array = caseInsensitiveWord.toCharArray();
		return hasThreeOrMoreVowels(array) && someLetterAppearsTwiceInARow(array) && !containsBanishedStrings(caseInsensitiveWord);
	}

	private boolean containsBanishedStrings(String caseInsensitiveWord) {

		return caseInsensitiveWord.contains("ab")
				|| caseInsensitiveWord.contains("cd")
				|| caseInsensitiveWord.contains("pq")
				|| caseInsensitiveWord.contains("xy");
	}

	private boolean someLetterAppearsTwiceInARow(char[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i+1]) return true;
		}
		return false;
	}

	private boolean hasThreeOrMoreVowels(char[] array) {

		int n = 0;

		for (char c : array)
			if (isVowel(c)) n++;

		return n>=3;
	}

	private boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

}
