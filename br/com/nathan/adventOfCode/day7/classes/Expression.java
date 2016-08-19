package br.com.nathan.adventOfCode.day7.classes;

import java.util.HashMap;

import br.com.nathan.adventOfCode.day7.interfaces.Signal;

public class Expression implements Signal {
	
	public Expression(Operator operator, HashMap<String, Signal> map, String... entries) {
		this.operator = operator;
		this.entries = entries;
		this.map = map;
		this.result = 0;
	}
	
	
	static final int MASK = (1 << 16) -1;
	Operator operator;
	int result;
	String[] entries;
	HashMap<String, Signal> map;

	@Override
	public int getValue() {
		
		if (result != 0) return result;
		
		int[] values = new int[2];
		
		for (int i = 0; i < entries.length; i++) {
			if (entries[i].matches("[0-9]+"))
				values[i] = Integer.parseInt(entries[i]);
			else
				values[i] = map.get(entries[i]).getValue();
			
		}
		
		switch (operator) {
			case AND:
				result = values[0] & values[1];
				break;
			case LSHIFT:
				result = values[0] << values[1];
				break;
			case RSHIFT:
				result = values[0] >> values[1];
				break;
			case NOT:
				result = ~ values[0]  & MASK;
				break;
			case OR:
				result = values[0] | values[1];
				break;
			
		}
		
		return result;
	}

	@Override
	public void reset() {
		result = 0;
	}

}
