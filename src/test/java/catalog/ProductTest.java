package catalog;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ProductTest {
	
	Product underTest;
	
	@Test
	public void shouldHaveName() {
		String name = "lawn chair";
		underTest = new Product(name);
		assertThat(underTest.getName(), is(name));
	}
}
