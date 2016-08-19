package adventOfCode.submit;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class PuzzleInput {
	private String path;
	public PuzzleInput(String path){
		this.path = path;
	}
	private List<String> getLines() {
			try {
				return Files.readAllLines(Paths.get(path));
			} catch (IOException e) {
				return new ArrayList<String>();
			}


	}
	public String getInOneLine(){
		List<String> lines = getLines();
		StringBuilder inOne = new StringBuilder();
		lines.forEach((line) ->	inOne.append("\n"+line));
		return inOne.toString().replaceFirst("\n", "");
	}
}
