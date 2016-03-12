package objective;

public class BrutObjective extends Objective {

	//Constructor:
	
	public BrutObjective (String titleObj) {
		this.title = titleObj;
		this.completed = false;
		switch(title) {
		case "Chateau Comtal" :
			this.place = new Place(2.36309051,43.2072481);
			break;
		case "Basilique St Nazaire" :
			this.place = new Place(2.36263,43.20538);
			break;
		case "Porte Narbonnaise" :
			this.place = new Place(2.36567,43.20676);
			break;
		case "Place Marcou" :
			this.place = new Place(2.36483,43.20657);
			break;
		case "Grand Puits" :
			this.place = new Place(2.36424,43.20744);
			break;
		default:
			break;
		}
	}
	
	
	@Override
	public boolean isOver() {
		return completed;
		
	}

	
	//SETTERS :
	
	@Override
	public
	void setTitle(String nTitle) {
		this.title = nTitle;
	}

	@Override
	public void setPlace(Place nPlace) {
		this.place = nPlace;
	}
	
	@Override
	public
	void setCompleted() {
		this.completed = true;

	}
	
	//GETTERS:
	
	@Override
	public Place getPlace() {
		return this.place;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public float getPlaceLatitude() {
		return this.place.latitude;
	}


	@Override
	public float getPlaceLongitude() {
		return this.place.longitude;
	}

	
	

	
}
