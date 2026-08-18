package anand.concurrent.consumerproducer.waitnotify;

public class Item {
	private int id;
	private String name;
	public Item(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
}
