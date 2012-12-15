
public class RomanNumerals {
	
	public String toRoman(int number){
		if(number > 3999 || number < 1)
			return null;
		String ans = "";
		while(number > 999) {
			ans = ans + "M";
			number = number - 1000;
		}
		if(number > 899) {
			ans = ans + "CM";
			number = number - 900;
		}
		if( number > 499) {
		  ans = ans + "D";
		  number = number - 500;
		}
		if( number > 399){
		  ans = ans + "CD";
		  number = number - 400;
		}
		while(number > 99){
		  ans = ans + "C";
		  number = number - 100;
		}
		if(number > 89){
		  ans = ans + "XC";
		  number = number - 90;
		}
		if(number > 49){
		  ans = ans + "L";
		  number = number - 50;
		}
		if(number > 39){
		  ans = ans + "XL";
		  number = number - 40;
		}
		while(number > 9){
		  ans = ans + "X";
		  number = number - 10;
		}
		if(number > 8){
		  ans = ans + "IX";
		  number = number - 9;
		}
		if(number > 4){
		  ans = ans + "V";
		  number = number - 5;
		}
		if(number > 3){
		  ans = ans + "IV";
		  number = number - 4;
		}
		while(number > 0){
		  ans = ans + "I";
		  number = number - 1;
		}	
		return ans;		
	}
	
}
