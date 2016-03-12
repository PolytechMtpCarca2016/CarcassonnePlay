package item;

public class BrutItemFactory extends ItemFactory {

	@Override
	public Item buildItemByName(String itemName) {
		return new BrutItem(itemName);
	}

}
