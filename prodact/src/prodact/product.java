package prodact;

import java.util.Random;

public class product {
	private int catalogId;
	private String name;
	private float price;

	public product(int catalogId, String name, float price) {
		this.catalogId = catalogId;
		this.name = name;
		this.price = price;
	}

	public product(String name, float price) {
		this.catalogId = new Random().nextInt(100000);
		this.name = name;
		this.price = price;
	}

	public int getCatalogId() {
		return catalogId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void print() {
		System.out.println("Catalog ID: " + catalogId + ", Name: " + name + ", Price: " + price);
	}

	/**
	 * Update the price by some percentage.
	 * 
	 * @param percent
	 *            the percent by which to update the price. May be negative
	 */
	public void updatePrice(float percent) {
		if (percent >= -100.0) {
			this.price *= 1 + percent / 100.0;
		}
	}
}
