package minigame;

public class BrutMiniGameFactory extends MiniGameFactory {

	@Override
	public Quizz buildQuizzFromTitle(String title) {
		return new BrutQuizz(title);
	}

	@Override
	public Enigma buildEnigmaFromTitle(String title) {
		return new BrutEnigma(title);
	}

}
