package objective;


public class BrutObjective extends Objective {

	
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
