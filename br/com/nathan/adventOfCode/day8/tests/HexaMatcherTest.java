package br.com.nathan.adventOfCode.day8.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.nathan.adventOfCode.day8.classes.HexaMatcher;

public class HexaMatcherTest {
	
	private HexaMatcher cut;

	@Before 
	public void setup() throws Exception {
		this.cut = new HexaMatcher();
	}
	
	@Test
	public void oneMatchReturnsThree() { 
		Assert.assertEquals(3, cut.getValueToDiscount("\\x01"));
	}
	
	@Test
	public void noMatchReturnsZero() {
		Assert.assertEquals(0, cut.getValueToDiscount(""));
	}
	
	@Test
	public void multipleMatchesReturnCorresponding() {
		Assert.assertEquals(6, cut.getValueToDiscount("\\x12\\xAF"));
	}
	
	@Test
	public void looksLikeHexaButIsNot() {
		Assert.assertEquals(0, cut.getValueToDiscount("\\x0H"));
	}
	
}
