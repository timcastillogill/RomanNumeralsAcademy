import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class RomanNumeralConverterTest {

	@Test
	public void
	given_one_return_I() {
		assertThat(new RomanNumeralConverter().convert(1), is("I"));
	}
}