package br.com.nathan.adventOfCode.day5.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.nathan.adventOfCode.day5.classes.DefaultRules;
import br.com.nathan.adventOfCode.day5.interfaces.IRule;

public class DefaultRulesTest {

	IRule rules;
	
	@Before
	public void setUp() throws Exception {
		rules = new DefaultRules(); 
	}

	@Test
	public void onlyThreeVowelsAreNotNice() {
		assertEquals(false, rules.eval("aei"));
	}
	
	@Test
	public void onlyRepeatedCharactersAreNotNice() {
		assertEquals(false, rules.eval("xx"));
	}
	
	@Test
	public void containsABanishedStringIsNotNice() {
		assertEquals(false, rules.eval("ab"));
	}
	
	@Test
	public void threeVowelsAndRepeatedCharactersIsNice() {
		assertEquals(true, rules.eval("aaaxx"));
	}
	
	@Test
	public void threeVowelsInARowIsNice() {
		assertEquals(true, rules.eval("aaa"));
	}
	
	@Test
	public void almostNiceButContainsBanishedString() {
		assertEquals(false, rules.eval("aaab"));
	}
	

}
