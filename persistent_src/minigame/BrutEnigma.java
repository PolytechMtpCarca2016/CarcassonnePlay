package minigame;

public class BrutEnigma extends Enigma {
	public BrutEnigma(String name) {
		switch(name) {
		// TODO générer les données
		case "donjon":
			this.question="qui etait la ?";
			this.answer="personne";
			break;
		case "chateau":
			this.question="qui etait duchesse?";
			this.answer="dame Carcas";
			break;
		default:
			break;
		}
	}
	
	@Override
	public String getQuestion() {
		return this.question;
	}

	@Override
	public String getAnswer() {
		return this.answer;
	}

}
