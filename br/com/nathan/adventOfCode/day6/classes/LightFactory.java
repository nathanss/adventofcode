package br.com.nathan.adventOfCode.day6.classes;

import br.com.nathan.adventOfCode.day6.interfaces.ILight;

public class LightFactory {

	public static ILight create() {
		return (ILight) new Light();
	}

	public static ILight create(String lightType) {
		ILight light;
		try {
			light = (ILight) Class.forName(lightType).newInstance();
		} catch (Exception e) {
			light = new Light();
		}

		return light;
	}

}
