package historical;

public class BrutHistoricalInfo extends HistoricalInfo {
	public BrutHistoricalInfo(String title) {
		this.title = title;
		switch(title) {
		// TODO générer les infos historiques en fonctions du titre
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
