package br.com.nathan.adventOfCode.day7.classes;

import java.util.HashMap;
import java.util.Map;

import br.com.nathan.adventOfCode.day7.interfaces.Signal;

public class Circuit {
	HashMap<String, Signal> map;
	SignalCreator sc;
	
	public Circuit(String code, SignalCreator sc) {
		map = new HashMap<>();
		this.sc = sc;
		
		loadCode(code);
		
		
	}
	
	public void recalculate() {
		for (Map.Entry<String,Signal> entry : map.entrySet()) {
		    entry.getValue().reset();
		}
	}
	
	public void loadCode(String code) {
		for (String signal: code.split("\n"))
			addSignal(signal);
	}
	
	private void addSignal(String signalString) {
		sc.addSignalToMap(signalString, map);
	}
	
	public int getValueFor(String node) {
		return map.get(node).getValue();
	}
}
