package br.com.nathan.adventOfCode.day6.interfaces;

public interface ILight {
	public void turnOn();
	public void turnOff();
	public void toggle();
	public boolean isOn();
	public int getBrightnessLevel();
}
