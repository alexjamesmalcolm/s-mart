package catalog;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

public class CartItemTest {
	
	CartItem underTest;
	
	@Test
	public void shouldHaveAProduct() {
		Product product = new Product("chair", new BigDecimal(1), 1);
		underTest = new CartItem();
		underTest.setProduct(product, 1);
		Product actual = underTest.getProduct();
		assertThat(actual, is(product));
	}
}
