package historical;

public class BrutHistoricalInfoFactory extends HistoricalInfoFactory {

	@Override
	public HistoricalInfo buildHistoricalInfoByTitle(String infoTitle) {
		return new BrutHistoricalInfo(infoTitle);
	}

}
