package objective;

public class BrutObjectiveFactory extends ObjectiveFactory {

	@Override
	public Objective BuildObjective(String titreObj, String theme) {
		return new BrutObjective (titreObj, theme);
	}

}
