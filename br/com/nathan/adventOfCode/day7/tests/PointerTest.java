package br.com.nathan.adventOfCode.day7.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import br.com.nathan.adventOfCode.day7.classes.Number;
import br.com.nathan.adventOfCode.day7.classes.Pointer;
import br.com.nathan.adventOfCode.day7.interfaces.Signal;

public class PointerTest {
	
	Signal number;
	HashMap<String, Signal> map;
	
	@Test
	public void pointsToNumber() {
		
		map = new HashMap<>();
		map.put("lx", new Number(12));
		map.put("a", new Pointer("lx", map)) ;
		
		assertEquals(12, map.get("a").getValue());
		
	}
	
	

}
