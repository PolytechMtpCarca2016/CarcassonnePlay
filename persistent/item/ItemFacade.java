package item;

public class ItemFacade {
	Item item = null;
	
	public void generateItem(String objective) {		
		ItemHandler handler = new ItemHandler();
		this.item = handler.getItem(objective);
	}
	
	public String getItemName() {
		return this.item.getName();
	}
	
	public String getItemTexture() {
		return this.item.getTexture();
	}
}
