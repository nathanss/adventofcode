package br.com.nathan.adventOfCode.day8.tests;

import org.junit.Before;
import org.junit.Test;

import br.com.nathan.adventOfCode.day8.classes.EscapedQuoteMatcher;
import org.junit.Assert;

public class EscapedQuoteMatcherTest {
	
	private EscapedQuoteMatcher cut;
	private static final String ESCAPED_QUOTE = new String("\\" + Character.toString( (char) 34 ));
	
	@Before
	public void setUp() throws Exception {
		cut = new EscapedQuoteMatcher();
	}
	
	@Test
	public void oneOcurrence() {
		Assert.assertEquals( 1 , cut.getValueToDiscount(ESCAPED_QUOTE));
	}
	
	@Test
	public void twoOcurrences() {
		Assert.assertEquals(2 , cut.getValueToDiscount(ESCAPED_QUOTE + "SOMETHING" + ESCAPED_QUOTE));
	}

}
