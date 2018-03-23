package catalog;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Product {

	public Product(String name, BigDecimal price, int quantity) {
		// TODO Auto-generated constructor stub
	}

	public Object getName() {
		return "lawn chair";
	}

	public BigDecimal getPrice() {
		return new BigDecimal(1);
	}

	public int getQuantity() {
		return 10;
	}

	public String getDescription() {
		return "good chair";
	}

	public Set<Cart> getCarts() {
		Set<Cart> carts = new HashSet<Cart>();
		return carts;
	}

}
