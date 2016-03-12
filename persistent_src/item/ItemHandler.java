package item;

public class ItemHandler {
	Item getItem(String itemName) {
		ItemFactory factory = new BrutItemFactory();
		return factory.buildItemByName(itemName);
	}
}
