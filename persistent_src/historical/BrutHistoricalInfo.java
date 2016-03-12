package historical;

public class BrutHistoricalInfo extends HistoricalInfo {
	public BrutHistoricalInfo(String title) {
		this.title = title;
		switch(title) {
		case "eglise":this.infos = "poulet";
			break;
		case "chateau" : this.infos = "coq";
			break;
		case "rempart" : this.infos = "canard";
			break;
		default:
			break;
		}
	}
	
	
	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public String getInfoText() {
		return this.infos;
	}

}
