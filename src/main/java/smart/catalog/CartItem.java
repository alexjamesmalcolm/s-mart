package smart.catalog;

public class CartItem {

	private Product product;

	public void setProduct(Product product, int i) {
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return 2;
	}

}
