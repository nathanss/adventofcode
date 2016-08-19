package br.com.nathan.adventOfCode.day5.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.nathan.adventOfCode.day5.classes.NewRules;
import br.com.nathan.adventOfCode.day5.interfaces.IRule;

public class NewRulesTest {
	
	IRule rules;

	@Before
	public void setUp() throws Exception {
		rules = new NewRules();
	}

	@Test
	public void hasAPairOfRepeatingSequenceInARowAndMirror() { //xyxy is nice
		assertEquals(true, rules.eval("XYXY"));
	}
	
	@Test
	public void hasAPairOfRepeatingSequenceButNotMirror() {
		assertEquals(false, rules.eval("XYabcdefghiXY"));
	}
	
	@Test
	public void doesNotHaveRepeatingSequenceNorMirror() {
		assertEquals(false, rules.eval("xbcd"));
	}

}
