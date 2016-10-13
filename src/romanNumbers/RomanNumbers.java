package romanNumbers;

public class RomanNumbers {
	public static void main(String[] args) {
		RomanNumbers rn = new RomanNumbers();
		rn.romanNumsToArabic("DCLXV");
	}

	public int romanChToNum(char ch) {
		switch (ch) {
		case 'I':
			return 1;

		case 'V':
			return 5;

		case 'X':
			return 10;

		case 'L':
			return 50;

		case 'C':
			return 100;

		case 'D':
			return 500;

		case 'M':
			return 1000;

		default:
			return 0;

		}
	}
	
	public int romanNumsToArabic(String str){
//		charAt(0);
		int res = 0;
		for (int i = 0; i < str.length()-1; i++) {
			System.out.println(str.charAt(i));
			if (romanChToNum(str.charAt(i)) < romanChToNum(str.charAt(i+1))) {
				res -= romanChToNum(str.charAt(i)) ;
			} else {
				res += romanChToNum(str.charAt(i)) ;
			}
			
		}
		res += romanChToNum(str.charAt(str.length()-1));
		
		return res;
		
	}

}