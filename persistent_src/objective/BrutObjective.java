package objective;


public class BrutObjective extends Objective {

	//Constructor:
	
	public BrutObjective (String nomObj, String theme) {
		this.titre = nomObj;
		this.theme = theme;
		this.completed = false;
	}
	
	
	@Override
	public boolean isOver() {
		return completed;
		
	}

	
	//SETTERS :
	
	@Override
	public
	Objective setTitre(String nTitre) {
		this.titre = nTitre;
		return this;
	}

	@Override
	public 
	Objective setLieu(Lieu nLieu) {
		this.lieu = nLieu;
		return this;
	}

	@Override
	public
	Objective setTheme(String nTheme) {
		this.theme = nTheme;
		return this;
	}
	
	@Override
	public Objective setMiniGame(MiniGame miniJeu) {
		this.MiniGame = miniJeu;
		return this;
	}

	@Override
	public Objective setHistoricalInfos(HistoricalInfos historicalInfos) {
		this.HistoricalInfos = historicalInfos;
		return this;
	}
	
	//GETTERS:
	
	@Override
	public Lieu getLieu() {
		return this.lieu;
	}

	@Override
	public String getTitle() {
		return this.titre;
	}

	@Override
	public String getTheme() {
		return this.theme;
	}

	
	

	
}
