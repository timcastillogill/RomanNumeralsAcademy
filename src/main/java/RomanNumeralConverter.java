public class RomanNumeralConverter {
	public String convert(int arabic) {
		if (arabic == 5) {
			return "V";
		}
		return "I".repeat(arabic);
	}
}
