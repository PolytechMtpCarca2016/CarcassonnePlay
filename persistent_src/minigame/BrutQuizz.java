package minigame;

public class BrutQuizz extends Quizz {
	public BrutQuizz(String name) {
		switch(name) {
		// TODO definir les infos à partir du nom
		case "donjon":
			this.question="combien etait la ?";
			this.answer=0;
			this.possibilities.add("une");
			break;
		case "castle":
			this.question="combien de duchesse?";
			this.answer=1;
			this.possibilities.add("une");
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
	public String getPossibility(int index) {
		return this.possibilities.get(index);
	}

	@Override
	public int getNumberOfPossibilities() {
		return this.possibilities.size();
	}

	@Override
	public int getAnswer() {
		return this.answer;
	}

}
