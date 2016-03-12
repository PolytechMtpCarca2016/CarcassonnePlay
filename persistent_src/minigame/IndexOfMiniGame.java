package minigame;

public class IndexOfMiniGame {
	public String getMiniGameType(String objective) {
		switch(objective) {
		// TODO donner type de minigame en fonction de l'objective
		case "castle":return "quizz";
		case "donjon":return "enigme";
		default:
			return null;
		}
	}
	
	public String getMiniGame(String objective) {
		switch(objective) {
		// TODO donner nom minigame en fonction de l'objective
		case "castle":return "royaume";
		case "donjon": return "prison";
		default:
			return null;
		}
	}
}
