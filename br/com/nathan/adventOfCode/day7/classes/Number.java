package br.com.nathan.adventOfCode.day7.classes;

import br.com.nathan.adventOfCode.day7.interfaces.Signal;

public class Number implements Signal {
	
	public Number (int entry) {
		this.entry = entry;
	}
	
	int entry;

	@Override
	public int getValue() {
		return entry;
	}

	@Override
	public void reset() {
		
	}

}
