package item;

public class ItemFacade {
	Item item = null;
	
	public void generateItem(String objective) {
		IndexOfItem index = new IndexOfItem();
		String itemTitle = index.getItem(objective);
		
		ItemHandler handler = new ItemHandler();
		this.item = handler.getItem(itemTitle);
	}
	
	public String getItemName() {
		return this.item.getName();
	}
	
	public String getItemTexture() {
		return this.item.getTexture();
	}
}
