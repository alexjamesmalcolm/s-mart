package catalog;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anySet;

import java.math.BigDecimal;
import java.util.Set;

import org.junit.Test;

public class ProductTest {
	
	Product underTest;
	
	@Test
	public void shouldHaveName() {
		String name = "lawn chair";
		underTest = new Product(name, null, 1);
		assertThat(underTest.getName(), is(name));
	}
	
	@Test
	public void shouldHavePrice() {
		BigDecimal price = new BigDecimal(1);
		underTest = new Product("name", price, 1);
		BigDecimal actual = underTest.getPrice();
		assertThat(actual, is(price));
	}
	
	@Test
	public void shouldHaveQuantity() {
		int quantity = 10;
		underTest = new Product("name", null, quantity);
		int actual = underTest.getQuantity();
		assertThat(actual, is(quantity));
	}
	
	@Test
	public void shouldHaveDescription() {
		String description = "good chair";
		underTest = new Product("chair", new BigDecimal(1), 1);
		String actual = underTest.getDescription();
		assertThat(actual, is(description));
	}
	
	@Test
	public void shouldHaveCarts() {
		underTest = new Product("chair", new BigDecimal(1), 1);
		Set<Cart> carts = underTest.getCarts();
		assertThat(carts, is(anySet()));
	}
}
