package br.com.nathan.adventOfCode.day6.classes;

import br.com.nathan.adventOfCode.day6.interfaces.ILight;

public class NewLight implements ILight {
	
	int brightness;
	
	public NewLight() {
		brightness = 0;
	}

	@Override
	public void turnOn() {
		brightness++;
	}

	@Override
	public void turnOff() {
		decreaseBrightness();
	}

	private void decreaseBrightness() {
		if (brightness > 0) brightness--;
	}

	@Override
	public void toggle() {
		brightness += 2;
		
	}

	@Override
	public boolean isOn() {
		return brightness > 0;
	}

	@Override
	public int getBrightnessLevel() {
		return brightness;
	}
	


}
