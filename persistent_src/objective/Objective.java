package objective;

public abstract class Objective {
	protected String titre;
	protected PositionGPS lieu;
	protected String theme;
	protected MiniGame miniJeu;
	protected HistoricalInfos historicalInfos;
	 
	// SETTERS :
	
	public abstract Objective setTitre (String nTitre);
	
	public abstract Objective setLieu (PositionGPS nLieu);
	
	public abstract Objective setTheme (String nTheme);
	
}
