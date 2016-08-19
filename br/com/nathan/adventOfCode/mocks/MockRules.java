package br.com.nathan.adventOfCode.mocks;

import java.util.ArrayList;
import java.util.List;

import br.com.nathan.adventOfCode.day5.interfaces.IRule;

public class MockRules implements IRule {


	private List<String> nices;
	private List<String> naughtys;

	public MockRules() {
		nices = new ArrayList<>();
		naughtys = new ArrayList<>();

		nices.add("nice");
		naughtys.add("naughty");
	}

	@Override
	public boolean eval(String word) {
		if (naughtys.contains(word)) return false;
		if (nices.contains(word)) return true;
		return false;
	}
}
