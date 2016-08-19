package br.com.nathan.adventOfCode.day6.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.nathan.adventOfCode.day6.classes.Light;
import br.com.nathan.adventOfCode.day6.interfaces.ILight;


public class LightTest {
	
	ILight cut;
	
	@Before
	public void setUp() throws Exception {
		this.cut = new Light();
	}
	
	
	@Test
	public void shouldStartTurnedOff() {
		assertFalse(cut.isOn());
	}
	
	@Test
	public void turnOnTurnsTheLightOn() {
		cut.turnOn();
		assertTrue(cut.isOn());
	}
	
	@Test
	public void twoTurnOnLeavesLightOn() {
		cut.turnOn();
		cut.turnOn();
		
		assertTrue(cut.isOn());
	}
	
	@Test
	public void oneToggleTurnsOn() {
		cut.toggle();
		assertTrue(cut.isOn());
	}
	
	@Test
	public void twoTogglesTurnsOff(){
		cut.toggle();
		cut.toggle();
		assertFalse(cut.isOn());
	}
	
	@Test
	public void turnOffTurnsItOff() {
		cut.turnOn();
		cut.turnOff();
		assertFalse(cut.isOn());
	}

}
