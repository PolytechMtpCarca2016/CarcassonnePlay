package item;

public class ItemHandler {
	Item getItem(String objectiveName) {
		ItemFactory factory = new BrutItemFactory();
		return factory.buildItemByName(objectiveName);
	}
}
