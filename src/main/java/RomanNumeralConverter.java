public class RomanNumeralConverter {
	public String convert(int arabic) {
		String result = "";

		if (arabic <= 3) {
			result += "I".repeat(arabic);
		}
		if (arabic > 3) {
			result += "V";
			result += "I".repeat(arabic - 5);
		}
		return result;
	}
}
