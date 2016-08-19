package br.com.nathan.adventOfCode.day7.classes;

import java.util.HashMap;

import br.com.nathan.adventOfCode.day7.interfaces.Signal;

public class SignalCreator {
	

	public void addSignalToMap(String signalString, HashMap<String, Signal> map) {
		
		String[] aux = signalString.split("->");
		String leftPart = aux[0].trim();
		String identifier = aux[1].trim();
		Signal signal;
		
		if (leftPart.contains("NOT")) {
			String operand = leftPart.split(" ")[1];
			signal = new Expression(Operator.NOT, map, operand);	 
		}
		else if (leftPart.contains("AND")) {
			String[] operands = splitAndTrim(leftPart, " AND " );
			signal = new Expression(Operator.AND, map, operands);
		}
		else if (leftPart.contains("OR")) {
			String[] operands = splitAndTrim(leftPart, " OR " );
			signal = new Expression(Operator.OR, map, operands);
		}
		else if (leftPart.contains("LSHIFT")) {
			String[] operands = splitAndTrim(leftPart, " LSHIFT " );
			signal = new Expression(Operator.LSHIFT, map, operands);
		}
		else if (leftPart.contains("RSHIFT")) {
			String[] operands = splitAndTrim(leftPart, " RSHIFT " );
			signal = new Expression(Operator.RSHIFT, map, operands);
		}
		else if (leftPart.matches("[0-9]+")) {
			signal = new Number(Integer.parseInt(leftPart));
		} else {
			signal = new Pointer(leftPart, map);
		}
		
		map.put(identifier, signal);
		
	}

	private String[] splitAndTrim(String string, String split) {
		String[] splitted = string.split(split);
		for (String s : splitted)
			s.trim();
		
		return splitted;
	}
}
