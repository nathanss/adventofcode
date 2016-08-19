package br.com.nathan.adventOfCode.day7.classes;

import java.util.HashMap;

import br.com.nathan.adventOfCode.day7.interfaces.Signal;

public class Pointer implements Signal {
	
	
	
	private String from;
	private HashMap<String, Signal> map;

	public Pointer (String from, HashMap<String, Signal> map) {
		this.from = from;
		this.map = map;
	}

	@Override
	public int getValue() {
		return map.get(from).getValue();
	}

	@Override
	public void reset() {
		
	}

}
