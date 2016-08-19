package br.com.nathan.adventOfCode.day7.tests;

import org.junit.Before;
import org.junit.Test;

import br.com.nathan.adventOfCode.day7.classes.Circuit;
import br.com.nathan.adventOfCode.day7.classes.SignalCreator;
import org.junit.Assert;

public class CircuitIntegrationTest {
	
	Circuit cut;

	
	/*123 -> x
	456 -> y
	x AND y -> d
	x OR y -> e
	x LSHIFT 2 -> f
	y RSHIFT 2 -> g
	NOT x -> h
	NOT y -> i */
	
	@Before
	public void setUp() throws Exception {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("123 -> x\n");
		sb.append("456 -> y\n");
		sb.append("x AND y -> d\n");
		sb.append("x OR y -> e\n");
		sb.append("x LSHIFT 2 -> f\n");
		sb.append("y RSHIFT 2 -> g\n");
		sb.append("NOT x -> h\n");
		sb.append("NOT y -> i");
		
		cut = new Circuit(sb.toString(), new SignalCreator());
		
	}
	
	@Test
	public void valueOfWires() {
		
		assertValueOfWire("d", 72);
		assertValueOfWire("e", 507);
		assertValueOfWire("f", 492);
		assertValueOfWire("g", 114);
		assertValueOfWire("h", 65412);
		assertValueOfWire("i", 65079);
		assertValueOfWire("x", 123);
		assertValueOfWire("y", 456);
	
		
	}

	private void assertValueOfWire(String identifier, int value) {
		Assert.assertEquals(value, cut.getValueFor(identifier));
		
	}
	

}
