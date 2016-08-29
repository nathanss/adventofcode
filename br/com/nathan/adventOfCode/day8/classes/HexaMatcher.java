package br.com.nathan.adventOfCode.day8.classes;

import java.util.regex.Pattern;

import br.com.nathan.adventOfCode.day8.interfaces.SantaMatcher;

public class HexaMatcher extends SantaMatcher {
	
	//four backslashes, two for java escape, two for regex escape
	public final String PATTERN = "\\\\x([0-9]|[A-F]|[a-f]){2}";
	
	
	public HexaMatcher() {
		this.pattern =  Pattern.compile(PATTERN);
		this.multiplier = 3;
	}
}
