package br.com.nathan.adventOfCode.day6.classes;

import br.com.nathan.adventOfCode.day6.interfaces.ILight;

public class Light implements ILight {

	private boolean turnedOn;

	public Light () {
		this.turnedOn = false;
	}

	@Override
	public void turnOn() {
		turnedOn = true;
	}

	@Override
	public void turnOff() {
		turnedOn = false;
	}

	@Override
	public void toggle() {
		turnedOn = !turnedOn;
	}

	@Override
	public boolean isOn() {
		return turnedOn;
	}

	@Override
	public int getBrightnessLevel() {
		if (turnedOn) return 1;
		return 0;
	}

}
