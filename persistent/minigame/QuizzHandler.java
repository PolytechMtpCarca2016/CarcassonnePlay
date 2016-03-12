package minigame;

public class QuizzHandler {
	private Quizz quizz = null;
	
	public void generateQuizz(String name) {
		MiniGameFactory factory = new BrutMiniGameFactory();
		this.quizz = factory.buildQuizzFromTitle(name);
	}
	
	public int getNumberOfPossibilities() {
		return this.quizz.getNumberOfPossibilities();
	}
	
	public String getPossibility(int index) {
		return this.quizz.getPossibility(index);
	}
	
	public Boolean isAnswer(int answer) {
		return this.quizz.getAnswer() == answer;
	}
}
