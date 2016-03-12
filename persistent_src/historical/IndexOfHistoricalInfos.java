package historical;

public class IndexOfHistoricalInfos {
	public String getInfoTitle(String objective) {
		switch(objective) {
		// TODO générer les titres d'infos selon titres objectifs
		case "castle" : return "chateau";
		case "donjon" : return "assaut";
		default :
			return null;
		}
	}
}
