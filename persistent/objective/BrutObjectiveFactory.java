package objective;

public class BrutObjectiveFactory extends ObjectiveFactory {

	@Override
	public BrutObjective BuildObjective(String titleObj) {
		return new BrutObjective (titleObj);
	}

}
