package br.com.nathan.adventOfCode.day8.classes;

import br.com.nathan.adventOfCode.day8.interfaces.SantaMatcher;

public class DoubleQuotesFixedDiscount extends SantaMatcher {
	
	@Override
	public int getValueToDiscount (String input) {
		return 2;
	}
	
}
