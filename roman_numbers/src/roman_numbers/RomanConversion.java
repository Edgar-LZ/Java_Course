package roman_numbers;

public class RomanConversion {
	public int convert(String roman) {
		IllegalArgumentException except = new IllegalArgumentException("Not a valid roman number");
		int arabic = 0;
		char prev = ' ';
		int count = 0;
		int prev_sum = 0; 
		for(int i=0;i<roman.length();i++) {
			switch(Character.toUpperCase(roman.charAt(i))) {
			case 'M':
				switch(prev) {
				case 'M':
					count+=1;
					if(count > 3)
						throw except;
					break;
				case 'C':
					if(count > 1)
						throw except;
					arabic+=800;
					count = 1;
					prev_sum = arabic; 
					break;
				case ' ':
					arabic +=1000;
					count = 1;
					break;
				default:
					throw except;
				}
				break;
			case 'D':
				switch(prev) {
				case 'C':
					if(count > 1)
						throw except;
					arabic+=300;
					count = 1;
					prev_sum = 400;
					break;
				case 'M':
					if(prev_sum == 900)
						throw except;
				case ' ':
					arabic +=500;
					count = 1;
					break;
				default:
					throw except;
				}
				break;
				
			case 'C':
				switch(prev) {
				case 'X':
					if(count > 1)
						throw except;
					arabic+=80;
					count = 1;
					prev_sum = 90;
					break;
				case 'C':
					count+=1;
					if(count > 3)
						throw except;
					break;
				case 'M':
					if(prev_sum == 900 || prev_sum == 400)
						throw except;
				case 'D':
				case ' ':
					arabic +=100;
					count = 1;
					break;
				default:
					throw except;
				}
				break;
			case 'L':
				switch(prev) {
				case 'X':
					if(count > 1)
						throw except;
					arabic+=30;
					prev_sum = 40;
					break;
				case 'M':
				case 'D':
				case 'C':
					if(prev_sum == 90)
						throw except;
				case ' ':
					arabic +=50;
					count = 1;
					break;
				default:
					throw except;
				}
				break;
			case 'X':
				switch(prev) {
				case 'I':
					if(count > 1)
						throw except;
					arabic+=8;
					prev_sum = 9;
					break;
				case 'X':
					count+=1;
					if(count > 3)
						throw except;
					break;
				case 'M':
				case 'D':
				case 'C':
				case 'L':
					if(prev_sum == 90 || prev_sum == 40)
						throw except;
				case ' ':
					arabic +=10;
					count = 1;
					break;
				default:
					throw except;
				}
				break;
			case 'V':
				switch(prev) {
				case 'I':
					if(count > 1)
						throw except;
					arabic+=3;
					count = 1;
					prev_sum = 4;
					break;
				case 'M':
				case 'D':
				case 'C':
				case 'L':
				case 'X':
					if(prev_sum == 9)
						throw except;
				case ' ':
					arabic +=5;
					count = 1;
					break;
				default:
					throw except;
				}
				break;
			case 'I':
				switch(prev) {
				case 'I':
					count+=1;
					if(count > 3)
						throw except;
					arabic+=1;
					break;
				case 'M':
				case 'D':
				case 'C':
				case 'L':
				case 'X':
				case 'V':
					if(prev_sum == 9 || prev_sum == 4)
						throw except;
				case ' ':
					arabic +=1;
					count = 1;
					break;
				default:
					throw except;
				}	
				break;
			}
			prev = Character.toUpperCase(roman.charAt(i));
		}
		return arabic;
	}
}
