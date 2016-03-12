package item;

public class BrutItemFactory extends ItemFactory {

	@Override
	public Item buildItemByName(String objectiveName) {
		return new BrutItem(objectiveName);
	}

}
