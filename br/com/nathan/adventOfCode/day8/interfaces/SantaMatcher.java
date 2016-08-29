package br.com.nathan.adventOfCode.day8.interfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class SantaMatcher {
	
	protected int multiplier;
	protected Pattern pattern;
	
	/*method that reads a literal string
	and returns the difference of the literal string and the size it would occupy in memory */
	public int getValueToDiscount(String input) {
		int ocurrences = 0;
		
		Matcher m = pattern.matcher(input);
		
		while (m.find()) {
			ocurrences++;
		}	
		return ocurrences * multiplier;
	}
}
