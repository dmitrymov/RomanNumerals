
public class RomanNumerals {
	
	public String toRoman(int number){
		if(number <= 0 || number >= 4000)
			return "";
		String ans = "";
		while(number > 9)
			ans = ans + "X";
		return null;
		
	}
	
}
