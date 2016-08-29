package br.com.nathan.adventOfCode.day8.classes;

import java.util.regex.Pattern;

import br.com.nathan.adventOfCode.day8.interfaces.SantaMatcher;

public class EscapedBackslashMatcher extends SantaMatcher {
	
	
	//two backslashes on regex
	public final String PATTERN = "\\\\\\\\"; 
	
	public EscapedBackslashMatcher() {
		this.pattern = Pattern.compile(PATTERN);
		this.multiplier = 1;
	}
}
