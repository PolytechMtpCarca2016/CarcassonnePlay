package minigame;

public abstract class MiniGameFactory {
	public abstract Quizz buildQuizzFromTitle(String title);
	public abstract Enigma buildEnigmaFromTitle(String title);
}
