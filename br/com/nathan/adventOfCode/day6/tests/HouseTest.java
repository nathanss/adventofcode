package br.com.nathan.adventOfCode.day6.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.nathan.adventOfCode.day6.classes.House;
import br.com.nathan.adventOfCode.mocks.MockLight;

public class HouseTest {
	
	House cut;
	
	@Before
	public void setUp() throws Exception {
		iStartANewHouse();
	}
	
	@Test
	public void initializeNewHouseWithLights() {
		assertEquals(100, cut.getNumberOfLights());
	}

	@Test
	public void turnsOnSingleLight() {
		cut.loadInstruction("turn on 0,0 through 0,0");
		assertEquals(1, cut.getNumberOfTurnedOnLights());
	}
	
	@Test
	public void turnsOn3x3Lights() {
		iTurnOnNineLights();
		assertEquals(9, cut.getNumberOfTurnedOnLights());
	}

	private void iTurnOnNineLights() {
		cut.loadInstruction("turn on 0,0 through 2,2");
	}
	
	@Test
	public void turnsOnAndOffLight() {
		cut.loadInstruction("turn on 0,0 through 1,1");
		cut.loadInstruction("turn off 0,0 through 1,1");
		assertEquals(0, cut.getNumberOfTurnedOnLights());
	}
	
	@Test
	public void togglesOnLights() {
		cut.loadInstruction("toggle 0,0 through 1,1");
		assertEquals(4, cut.getNumberOfTurnedOnLights());
	}
	
	@Test
	
	public void togglesOnAndOffLights() {
		cut.loadInstruction("toggle 0,0 through 1,1");
		cut.loadInstruction("toggle 0,0 through 1,1");
		assertEquals(0, cut.getNumberOfTurnedOnLights());
	}
	
	@Test
	public void numberOfLightsTurnedOnEqualsBrightness() {
		iTurnOnNineLights();
		assertEquals(cut.getTotalBrightness(), cut.getNumberOfTurnedOnLights());
	}
	
	

	private void iStartANewHouse() {
		cut = new House(10, 10, new MockLight());
	}
}
