package br.com.nathan.adventOfCode.day6.classes;

import java.lang.reflect.InvocationTargetException;

import br.com.nathan.adventOfCode.day6.interfaces.ILight;

public class House {

	private ILight[][] lights;
	private ILight lightType;

	public House(int width, int height, ILight lightType) {
		this.lightType = lightType;
		this.lights = new ILight[width][height];
		setUpLights(width, height);
	}

	private void setUpLights(int width, int height) {
		for (int i = 0; i < width; i++)
			for (int j = 0; j < height; j++) {
				try {
					lights[i][j] = lightType.getClass().newInstance();
				} catch (InstantiationException | IllegalAccessException e) {
					lights[i][j] = new Light();
				}
			}
	}

	public ILight[][] getLights() {
		return lights;
	}

	public int getNumberOfLights() {
		return lights.length * lights[0].length;
	}

	public void loadInstruction(String string) {
		String methodName;
		if (string.contains("turn on")) methodName = "turnOn";
		else if (string.contains("turn off")) methodName = "turnOff";
		else methodName = "toggle";

		String numbers = string.replaceAll("[a-zA-Z]", "").trim().replaceAll("  ", " ");

		String[] coordinates = numbers.split(" ");

		String[] minCoordinates = coordinates[0].split(",");
		int minLine = Integer.parseInt(
				minCoordinates[0]
		);
		int minColumn = Integer.parseInt(
				minCoordinates[1]
		);

		String[] maxCoordinates = coordinates[1].split(",");
		int maxLine = Integer.parseInt(
				maxCoordinates[0]
		);
		int maxColumn = Integer.parseInt(
				maxCoordinates[1]
		);

		for (int i = minLine; i <= maxLine; i++ ) {
			for (int j = minColumn; j <= maxColumn; j++ ) {
				try {
					lights[i][j].getClass().getMethod(methodName).invoke(lights[i][j]);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
						| NoSuchMethodException | SecurityException e) {

				}
			}
		}
	}

	public void loadInstructions (String[] strings) {
		for (String string : strings)
			loadInstruction(string);
	}

	public int getNumberOfTurnedOnLights() {
		int n = 0;

		for (int i = 0; i < lights.length; i++)
			for (int j = 0; j < lights[i].length; j++)
				if (lights[i][j].isOn()) n++;

		return n;

	}
	
	public int getTotalBrightness() {
		int n = 0;
		
		for (int i = 0; i < lights.length; i++)
			for (int j = 0; j < lights[i].length; j++)
				n += lights[i][j].getBrightnessLevel();
		
		return n;
	}
}
