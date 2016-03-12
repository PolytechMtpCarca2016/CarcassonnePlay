package minigame;

public class EnigmaHandler {
	private Enigma enigma = null;
	
	public void generateEnigma(String name) {
		MiniGameFactory factory = new BrutMiniGameFactory();
		this.enigma = factory.buildEnigmaFromTitle(name);
	}
	
	public String getEnigma() {
		return this.enigma.getQuestion();
	}
	
	public Boolean isAnswer(String answer) {
		return this.enigma.getAnswer().equals(answer);
	}
}
