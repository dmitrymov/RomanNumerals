
public class RomanNumerals {
	
	public String toRoman(int number){
		if(number <= 0 || number >= 4000)
			return "";
		String ans = "";
		while(number > 49) {
			number -= 50;
			ans = ans + "C";
		}
		while(number >= 40) {
			number -= 5;
			ans = ans + "XC";
		}

		while(number > 9) {
			number -= 10;
			ans = ans + "X";
		}
		while(number > 4) {
			number -= 5;
			ans = ans + "V";
		}
		if(number == 4) {
			number -= 4;
			ans = ans + "IV";
		}
		while(number > 0) {
			number -= 1;
			ans = ans + "I";
		}
		return ans;
		
	}
	
}
