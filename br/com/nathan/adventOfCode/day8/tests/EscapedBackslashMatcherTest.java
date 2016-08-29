package br.com.nathan.adventOfCode.day8.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.nathan.adventOfCode.day8.classes.EscapedBackslashMatcher;

public class EscapedBackslashMatcherTest {
	
	private EscapedBackslashMatcher cut;
	public static final String ESCAPED_BACKSLASH = "\\\\";
	
	
	@Before
	public void setUp() throws Exception {
		this.cut = new EscapedBackslashMatcher();
	}
	
	@Test
	public void twoOcurrences() {
		Assert.assertEquals(2 , cut.getValueToDiscount(ESCAPED_BACKSLASH + "SOMETHING" +  ESCAPED_BACKSLASH));
	}
	
	@Test
	public void oneOcurrence() {
		Assert.assertEquals(1 , cut.getValueToDiscount(ESCAPED_BACKSLASH));
	}

}
