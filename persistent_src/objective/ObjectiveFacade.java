package objective;


public class ObjectiveFacade {
	
	/**
	public MiniGame startMiniGame() {
		return ;
	}
	**/
	
	public String deliverHistoricalInfo(Objective objective) {
		return objective.historicalInfo.getInfos(); /**getInfos ou une autre fonction identique**/
	}	
	
	/** TODO : Comment fait on pour déterminer qu'un objectif est terminé.
	public boolean isCompleteObjectif () {
		return 
	};
	**/
	
	public boolean isNear (Knight knight) {
		return Navigation.isNear(objective, knight);
	};
	

	// GETTERS : 

	public PositionGPS getLieu (Objective objective) {
		return objective.Lieu;
	}
	public String getTitle (Objective objective) {
		return objective.Title;
	}
	public String getTheme (Objective objective) {
		return objective.Theme;
	}
}
