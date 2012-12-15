
public class RomanNumerals {
	
	public String toRoman(int number){
		if(number <= 0 || number >= 4000)
			return "";
		String ans = "";
		while(number > 9) {
			ans = ans + "X";
		}
		while(number > 4) {
			ans = ans + "V";
		}
		while(number > 0) {
			ans = ans + "I";
		}
		int num = 0;
		return null;
	}
	
}
