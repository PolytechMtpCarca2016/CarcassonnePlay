package item;

public class BrutItem extends Item {
	public BrutItem(String objectiveName) {
		switch(objectiveName){
		case "Chateau Comtal":
			this.name="Plan du château";
			this.texture="chateau.png";
			break;
		case "Basilique St Nazaire":
			this.name="Lettre";
			this.texture="parchemin.png";
			break;
		case "Porte Narbonaise":
			this.name="Epée";
			this.texture="epee.png";
			break;
		case "Place Marcou":
			this.name="Clef";
			this.texture="key.png";
			break;
		case "Grand Puits":
			this.name="Casque";
			this.texture="casque.png";
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
