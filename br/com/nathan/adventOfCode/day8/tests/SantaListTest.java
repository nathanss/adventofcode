package br.com.nathan.adventOfCode.day8.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.nathan.adventOfCode.day8.classes.SantaList;


public class SantaListTest {
	
	public static final String ONE_DOUBLE_QUOTE = Character.toString((char) 34);
	public static final String BACKSLASH = Character.toString((char) 92 );
	
	public static final String TWO_DOUBLE_QUOTES = ONE_DOUBLE_QUOTE + ONE_DOUBLE_QUOTE;	
	public static final String ABC = ONE_DOUBLE_QUOTE + "abc" + ONE_DOUBLE_QUOTE;
	public static final String QUOTE_ESCAPE = ONE_DOUBLE_QUOTE + "aaa" + BACKSLASH + ONE_DOUBLE_QUOTE + "aaa" + ONE_DOUBLE_QUOTE;
	public static final String HEXA_ESCAPE = ONE_DOUBLE_QUOTE + BACKSLASH + "x27" + ONE_DOUBLE_QUOTE;
	
	public static final String SUPERPOSITION = ONE_DOUBLE_QUOTE + BACKSLASH + BACKSLASH + "55" + BACKSLASH + BACKSLASH + "x" + ONE_DOUBLE_QUOTE;
	
	private SantaList cut;
	
	@Test
	public void sizesWithDoubleQuotes() {
		setUpWith(TWO_DOUBLE_QUOTES);
		Assert.assertEquals(0, cut.getInMemorySize());
		Assert.assertEquals(2, cut.getLiteralSize());
	}
	
	@Test
	public void sizesWithAbc() {
		setUpWith(ABC);
		Assert.assertEquals(3, cut.getInMemorySize());
		Assert.assertEquals(5, cut.getLiteralSize());
	}
	
	@Test
	public void sizesWithQuoteEscape() {
		setUpWith(QUOTE_ESCAPE);
		Assert.assertEquals(7, cut.getInMemorySize());
		Assert.assertEquals(10, cut.getLiteralSize());
	}
	
	@Test
	public void sizesWithHexaEscape() {
		setUpWith(HEXA_ESCAPE);
		Assert.assertEquals(1, cut.getInMemorySize());
		Assert.assertEquals(6, cut.getLiteralSize());
		
	}
	
	@Test
	public void sizesWithSuperposition() {
		setUpWith(SUPERPOSITION);
		Assert.assertEquals(1, cut.getInMemorySize());
		Assert.assertEquals(6, cut.getLiteralSize());
	}
	
	private void setUpWith(String s) {
		cut = new SantaList(s);
	}
	
	
	
}
