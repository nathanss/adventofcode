package br.com.nathan.adventOfCode.day5.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.nathan.adventOfCode.day5.classes.NiceStringDetector;
import br.com.nathan.adventOfCode.day5.interfaces.IRule;
import br.com.nathan.adventOfCode.mocks.MockRules;

public class NiceStringDetectorTest {
	//criar um mock para as regras
	
	
	private NiceStringDetector niceStringDetector;
	
	@Before
	public void setUp() throws Exception {
		
		IRule mockRules = new MockRules();
		this.niceStringDetector = new NiceStringDetector(mockRules);
		
	}

	@Test
	public void addsOneNiceString() {
		this.niceStringDetector.addString("nice");
		
		assertEquals(1, this.niceStringDetector.numberOfNiceStrings());		
	}
	
	@Test
	public void addsTwoNiceStrings(){
		this.niceStringDetector.addString("nice");
		this.niceStringDetector.addString("nice");
		
		assertEquals(2, this.niceStringDetector.numberOfNiceStrings());
	}
	
	@Test
	public void addsOneNiceAndOneNaughtyString(){
		this.niceStringDetector.addString("nice");
		this.niceStringDetector.addString("naughty");
		
		assertEquals(1, this.niceStringDetector.numberOfNiceStrings());
	}

}
