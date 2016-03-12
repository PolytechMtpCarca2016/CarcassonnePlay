package historical;

public class HistoricalInfoFacade {
	public String getInfos(String objective) {
		IndexOfHistoricalInfos index = new IndexOfHistoricalInfos();
		String infoTitle = index.getInfoTitle(objective);
		
		HistoricalInfoHandler handler = new HistoricalInfoHandler();
		return handler.getInfos(infoTitle);
	}
}
