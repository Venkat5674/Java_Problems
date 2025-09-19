

package collections;

public class Fruit implements Comparable<Fruit> {

	String name;
	String color;
	int price;

	public Fruit(String name, String color, int price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Fruit o) {
		String color1 = this.color;
		String color2 = o.color;
		
		return color1.compareTo(color2);
	}

}
