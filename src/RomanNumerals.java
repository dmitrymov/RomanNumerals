
public class RomanNumerals {
	
	public String toRoman(int number){
		if(number <= 0 || number >= 4000)
			return "";
		String ans = "";
		while(number > 9) {
			number -= 10;
			ans = ans + "X";
		}
		while(number > 4) {
			number -= 5;
			ans = ans + "V";
		}
		return null;
		
	}
	
}
