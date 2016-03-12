package objective;

public abstract class Objective {
	protected String titre;
	protected Lieu lieu;
	protected String theme;
	protected MiniGame miniJeu;
	protected HistoricalInfos historicalInfos;
	protected boolean completed;
	 
	public abstract boolean isOver ();
	
	// SETTERS :
	
	public abstract Objective setTitre (String nTitre);
	
	public abstract Objective setLieu (Lieu nLieu);
	
	public abstract Objective setTheme (String nTheme);

	public abstract Objective setMiniGame (MiniGame miniJeu);
	
	public abstract Objective setHistoricalInfos (HistoricalInfos historicalInfos);
	
	// GETTERS : 

	public abstract Lieu getLieu ();
	
	public abstract String getTitle ();

	public abstract String getTheme ();
}
