package br.com.nathan.adventOfCode.mocks;

import br.com.nathan.adventOfCode.day6.interfaces.ILight;

public class MockLight implements ILight {

	boolean isOn;

	public MockLight() {
		isOn = false;
	}

	@Override
	public void turnOn() {
		isOn = true;
	}

	@Override
	public void turnOff() {
		isOn = false;
	}

	@Override
	public void toggle() {
		isOn = !isOn;
	}

	@Override
	public boolean isOn() {
		return isOn;
	}

	@Override
	public int getBrightnessLevel() {
		if (isOn) return 1;
		return 0;
	}

}
