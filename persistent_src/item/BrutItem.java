package item;

public class BrutItem extends Item {
	public BrutItem(String itemName) {
		this.name = itemName;
		switch(itemName){
		// TODO g�n�rer les infos � partir du nom
		case "chevalier":this.texture="adoube";
			break;
		case "prisonnier":this.texture="mauvais";
			break;
		default:
			break;
		}
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getTexture() {
		return this.texture;
	}

}
