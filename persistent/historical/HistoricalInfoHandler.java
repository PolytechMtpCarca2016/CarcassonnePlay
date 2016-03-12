package historical;

public class HistoricalInfoHandler {
	public String getInfos(String infoTitle) {
		HistoricalInfoFactory factory = new BrutHistoricalInfoFactory();
		HistoricalInfo info = factory.buildHistoricalInfoByTitle(infoTitle);
		return info.getInfoText();
	}
}
