package minigame;

public class IndexOfMiniGame {
	public String getMiniGameType(String objective) {
		switch(objective) {
		// TODO donner type de minigame en fonction de l'objective
		case "place marcou":
			return "enigma";
		case "vieux puits":
			return "enigma";
		case "chateau comtal":
			return "enigma";
		case "porte narbonaise":
			return "enigma";
		case "basilique":
			return "enigma";
		default:
			return null;
		}
	}
}
