package objective;

public class Place {
	float latitude;
	float longitude;
	
	public Place(String s,float n,float m){
		this.latitude=n;
		this.longitude=m;
	}
	// GETTERS :
	
	public float getLatitude () {
		return this.latitude;
	};

	public float getLongitude () {
		return this.longitude;
	};

}
