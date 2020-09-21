package exercise_page_19_20_if_else;

public class Exercise_1 {

	public static void main(String[] args) {
		
		
		int a= 14;
		int b = 4;
		int answer=7;
		
		if (answer==a*b) {System.out.println(true);}
		else if(answer==a+b) {System.out.println(true);}
		else if(answer==a-b) {System.out.println(true);}
		else if(answer==a/b) {System.out.println(true);}
		
		else {System.out.println(false);}
		
		

	}

}
/*
(1) The number 7 is a truly great number. Given two integer values, a and b, return true
if either one is 7 or their sum or difference is 7. Otherwise return false.
greatNumber(7,1) -> true
greatNumber(3,4) -> true
greatNumber(13,6) -> true
greatNumber(1,5) -> false

public boolean greatNumber(int a, int b){
}
 
*/