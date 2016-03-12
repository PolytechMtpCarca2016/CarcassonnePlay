package objective;

public class ObjectiveFacade {
	private ObjectiveManager objManager;
	

	
	public Objective getObjectiveByName(String nameObj) {
		ObjectiveManager objManager = new ObjectiveManager();
		objManager.generateObjective(nameObj);
		return objManager.objective;
	
	
	}
	
	
	public boolean isNear (float latitude, float longitude) {
		Navigation nav = new Navigation();
		return nav.isNear(objManager.objective, latitude, longitude);
	};
	

	// GETTERS : 

	public Place getPlace () {
		return this.objManager.objective.place;
	}
	public String getTitle () {
		return this.objManager.objective.title;
	}
	public boolean getState () {
		return this.objManager.objective.completed;
	}
	public float getPlaceLatitude() {
		return this.objManager.objective.place.latitude;
	}
	public float getPlaceLongitude() {
		return this.objManager.objective.place.longitude;
	}
}
