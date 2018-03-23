package catalog;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

public class ProductTest {
	
	Product underTest;
	
	@Test
	public void shouldHaveName() {
		String name = "lawn chair";
		underTest = new Product(name, null);
		assertThat(underTest.getName(), is(name));
	}
	
	@Test
	public void shouldHavePrice() {
		BigDecimal price = new BigDecimal(1);
		underTest = new Product("name", price);
		BigDecimal actual = underTest.getPrice();
		assertThat(actual, is(price));
	}
	
	@Test
	public void shouldHaveQuantity() {
		int quantity = 10;
		underTest = new Product("name", null);
		int actual = underTest.getQuantity();
		assertThat(actual, is(quantity));
	}
}
