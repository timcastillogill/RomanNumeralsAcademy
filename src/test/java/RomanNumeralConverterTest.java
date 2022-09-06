import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class RomanNumeralConverterTest {

	@ParameterizedTest
	@CsvSource(
			{"1,I",
			"2,II",
			"3,III"
			}
	)
	public void
	given_arabic_numeral_with_only_ones_return_roman_numeral(int arabic, String roman) {
		assertThat(new RomanNumeralConverter().convert(arabic), is(roman));
	}

	@ParameterizedTest
	@CsvSource(
			{"5,V",
					"6, VI",
					"7, VII"
			}
	)
	public void
	given_arabic_numerals_from_five_to_eight_return_roman_numeral(int arabic, String roman) {
		assertThat(new RomanNumeralConverter().convert(arabic), is(roman));
	}

}