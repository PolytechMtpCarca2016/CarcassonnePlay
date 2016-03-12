package item;

public class IndexOfItem {
	String getItem(String objective) {
		switch(objective) {
		// TODO faire correspondance titre objectif avec nom item
		case "castle":return "chevalier";
		case "donjon":return "prisonnier";
		default:
			return null;
		}
	}
}
