package br.com.nathan.adventOfCode.day6.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.nathan.adventOfCode.day6.classes.LightFactory;

public class LightFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void noParameterReturnsDefaultLight() {
		assertEquals ("Light", LightFactory.create().getClass().getSimpleName());
	}
	
	@Test
	public void withParameterReturnsRespectiveLight() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		assertEquals ("Light", LightFactory.create("adventOfCode.day6.classes.Light").getClass().getSimpleName());
	}
	
	@Test
	public void nonExistingNameReturnsDefaultLight() {
		assertEquals ("Light", LightFactory.create("asdasdasd").getClass().getSimpleName());
	}

}
