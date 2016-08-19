package br.com.nathan.adventOfCode.day6.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.nathan.adventOfCode.day6.classes.NewLight;
import br.com.nathan.adventOfCode.day6.interfaces.ILight;

public class NewLightTest {
	
	ILight cut;
	
	@Before
	public void setUp() throws Exception {
		cut = new NewLight();
	}
	
	@Test
	public void initialBrightnessIsZero() {
		assertBrightnessLevelIsZero();
	}
	
	@Test
	public void turnOnIncreasesBrightness() {
		givenOneTurnOn();
		assertEquals(1, cut.getBrightnessLevel());
	}

	@Test
	public void turnOffDecreasesTheBrightness() {
		givenOneTurnOn();
		givenOneTurnOff();
		assertBrightnessLevelIsZero();
		
	}
	
	@Test
	public void turnOffDoesNotTurnBrightnessNegative() {
		givenOneTurnOff();
		assertBrightnessLevelIsZero();
	}
	
	@Test
	public void toggleIncreasesBrightnessByTwo() {
		givenOneToggle();
		assertEquals(2, cut.getBrightnessLevel());
	}
	
	
	private void givenOneToggle() {
		cut.toggle();
	}

	private void givenOneTurnOn() {
		cut.turnOn();
	}
	
	private void assertBrightnessLevelIsZero() {
		assertEquals(0, cut.getBrightnessLevel());
	}

	private void givenOneTurnOff() {
		cut.turnOff();
	}
}
