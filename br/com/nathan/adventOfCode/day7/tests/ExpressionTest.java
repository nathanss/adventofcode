package br.com.nathan.adventOfCode.day7.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import br.com.nathan.adventOfCode.day7.classes.Expression;
import br.com.nathan.adventOfCode.day7.classes.Number;
import br.com.nathan.adventOfCode.day7.classes.Operator;
import br.com.nathan.adventOfCode.day7.interfaces.Signal;

public class ExpressionTest {
	
	private final int binary30 	= 	0b00011110;
	private final int binary240 = 	0b11110000;
	private final int binary254 =   0b11111110;
	private final int binary120 =   0b01111000;
	private final int binary112 = 	0b01110000;
	
	private HashMap<String, Signal> map;
	private String[] entries;
	
	public void createEntriesAndHashMap(int... numbers) {
		
		entries = new String[numbers.length];
		map = new HashMap<>();
		
		for (int i = 0; i < numbers.length; i++) {
			entries[i] = String.valueOf(numbers[i]);
			map.put( entries[i], new Number (numbers[i]) );
		}
	}
	
	@Test
	public void andOperation() {
		
		createEntriesAndHashMap(binary240, binary120);
		Expression expression = new Expression(Operator.AND, map, entries);
		assertEquals(binary112, expression.getValue());
		
	}
	
	@Test
	public void leftShiftOperation() {
		createEntriesAndHashMap(binary120, 1);
		Expression expression = new Expression(Operator.LSHIFT, map, entries);
		assertEquals(binary240, expression.getValue());
	}
	
	@Test
	public void rightShiftOperation() {
		createEntriesAndHashMap(binary120, 2);
		Expression expression = new Expression(Operator.RSHIFT, map, entries);
		assertEquals(binary30, expression.getValue());
		
	}
	
	@Test
	public void orOperation() {
		createEntriesAndHashMap(binary240, binary30);
		Expression expression = new Expression(Operator.OR, map, entries);
		assertEquals(binary254, expression.getValue());
	}
	
	@Test
	public void notOperation() {
		createEntriesAndHashMap(1);
		
		Expression expression = new Expression(Operator.NOT, map, entries);
		assertEquals(65534, expression.getValue());
		
	}
	

}
