package minigame;

import java.util.ArrayList;
import java.util.List;

public abstract class Quizz {
	protected String question = null;
	protected int answer = -1;
	protected List<String> possibilities = new ArrayList<String>();
	
	public abstract String getQuestion();
	public abstract String getPossibility(int index);
	public abstract int getNumberOfPossibilities();
	public abstract int getAnswer();
	
	protected void addPossibility(int index, String possibility) {
		this.possibilities.add(index, possibility);
	}
}
