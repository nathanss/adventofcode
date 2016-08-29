package br.com.nathan.adventOfCode.day8.classes;

import java.util.regex.Pattern;

import br.com.nathan.adventOfCode.day8.interfaces.SantaMatcher;

public class EscapedQuoteMatcher extends SantaMatcher {

	// four backslashes, two for java escape, two for regex escape
	//34 = "
	public final String PATTERN = "\\\\" + Character.toString((char)34);


	public EscapedQuoteMatcher() {
		this.pattern = Pattern.compile(PATTERN);
		this.multiplier = 1;
	}

}
