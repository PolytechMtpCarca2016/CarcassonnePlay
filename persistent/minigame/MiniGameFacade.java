package minigame;

public class MiniGameFacade {
	private QuizzHandler quizzHandler = new QuizzHandler();
	private EnigmaHandler enigmaHandler = new EnigmaHandler();
	
	public String getTypeMiniGame(String objective) {
		IndexOfMiniGame index = new IndexOfMiniGame();
		return index.getMiniGameType(objective);
	}
	
	public void generateMiniGame(String objective) {
		IndexOfMiniGame index = new IndexOfMiniGame();
		
		if(index.getMiniGameType(objective).equals("quizz")) {
			this.quizzHandler.generateQuizz(objective);
		} else {
			this.enigmaHandler.generateEnigma(objective);
		}
	}

	public String getEnigma() {
		return this.enigmaHandler.getEnigma();
	}
	
	public Boolean isAnswer(String answer) {
		return this.enigmaHandler.isAnswer(answer);
	}
	
	public int getNumberOfPossibilities() {
		return this.quizzHandler.getNumberOfPossibilities();
	}
	
	public String getPossibility(int index) {
		return this.quizzHandler.getPossibility(index);
	}
	
	public Boolean isAnswer(int answer) {
		return this.quizzHandler.isAnswer(answer);
	}
}
