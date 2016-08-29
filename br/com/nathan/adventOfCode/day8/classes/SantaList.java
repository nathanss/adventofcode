package br.com.nathan.adventOfCode.day8.classes;

import br.com.nathan.adventOfCode.day8.interfaces.SantaMatcher;

public class SantaList {

	String[] list;
	SantaMatcher[] discounts;

	public SantaList(String code) {
		list = code.split("\n");

		discounts = new SantaMatcher[4];
		discounts[0] = new HexaMatcher();
		discounts[1] = new EscapedQuoteMatcher();
		discounts[2] = new EscapedBackslashMatcher();
		discounts[3] = new DoubleQuotesFixedDiscount();
	}

	public int getLiteralSize() {
		int n = 0;
		for (String listItem : list)
			n += listItem.length();

		return n;

	}

	public int getInMemorySize() {
		int size = 0;
		for (String listItem : list) {
			size += listItem.length() - applyDiscounts(listItem);
		}

		return size;
	}

	private int applyDiscounts(String listItem) {
		int discount = 0;
		for (SantaMatcher matcher : discounts) {
			discount += matcher.getValueToDiscount(listItem);
		}

		return discount;
	}

}
