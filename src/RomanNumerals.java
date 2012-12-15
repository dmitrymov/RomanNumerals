
public class RomanNumerals {
	
	public String toRoman(int number){
		if(number <= 0 || number >= 4000)
			return "";
		String ans = "";
		while(number > 49) {
			number -= 50;
			ans = ans + "L";
		}
		while(number >= 40) {
			number -= 40;
			ans = ans + "XL";
		}

		while(number > 9) {
			number -= 10;
			ans = ans + "X";
		}
		if(number == 9) {
			number -= 9;
			ans = ans + "IX";
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
