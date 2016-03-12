package objective;

public class ObjectiveManager {
	Objective objective;
	
	public void generateObjective (String titleObj) {
		ObjectiveFactory oFactory = new BrutObjectiveFactory();
		this.objective = oFactory.BuildObjective(titleObj);
	}
}
	
