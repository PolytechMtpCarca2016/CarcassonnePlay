package objective;

public abstract class Objective {
	protected String title;
	protected Place place;
	protected boolean completed;
	 
	public abstract boolean isOver ();
	
	// SETTERS :
	
	public abstract void setTitle (String nTitle);
	
	public abstract void setPlace (Place nPlace);
	
	public abstract void setCompleted();
	
	// GETTERS : 

	public abstract Place getPlace ();
	
	public abstract String getTitle ();
	
	public abstract float getPlaceLatitude();
	
	public abstract float getPlaceLongitude();
}
