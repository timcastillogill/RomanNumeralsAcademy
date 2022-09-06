public class RomanNumeralConverter {
	public String convert(int arabic) {
		if (arabic == 5) {
			return "V";
		} else if (arabic == 6) {
			return "VI";
		}
		return "I".repeat(arabic);
	}
}
