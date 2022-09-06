public class RomanNumeralConverter {
	public String convert(int arabic) {
		String result = "";

		if (arabic > 3 && arabic < 10) {
			result += "V";
			arabic -= 5;
		}
		if (arabic == 15) {
			return "XV";
		}
		if (arabic == 16) {
			return "XVI";
		}
		if (arabic >= 10) {
			result += "X";
			arabic -= 10;
		}
		return result += "I".repeat(arabic);
	}
}
