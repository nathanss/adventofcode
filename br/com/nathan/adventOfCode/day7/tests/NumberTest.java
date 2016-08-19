package br.com.nathan.adventOfCode.day7.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.nathan.adventOfCode.day7.classes.Number;
import br.com.nathan.adventOfCode.day7.interfaces.Signal;

public class NumberTest {
	
	Signal number;
	
	@Test
	public void holdsValue() {
		number = new Number(255);
		assertEquals(255, number.getValue());
	}

}
