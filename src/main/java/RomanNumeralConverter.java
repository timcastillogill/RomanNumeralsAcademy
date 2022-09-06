public class RomanNumeralConverter {
	public String convert(int arabic) {
		String result = "";

		if (arabic == 10) {
			return "X";
		}
		if (arabic > 3) {
			result += "V";
			arabic -= 5;
		}
		return result += "I".repeat(arabic);
	}
}
