package day3;

public class Method_Argument {

	public static void main(String[] args) {
	addition(26,28);
	addition(9,10);
multiplication (9,6);
multiplication (19,16);
subtraction(12,20);
subtraction(400,178);
devide(9,3);
devide(555,11);


	}
public static void addition(int x,int y) { 
	int z= x+ y;
	
	
	System.out.println(z);
	
	
}
public static void multiplication(int a, int b) {
	
	int c= a * b ;
	
	
	System.out.println(c);
}
public static void subtraction(int e, int f) {
	
	int g = e - f ;
	
	System.out.println(g);
}
public static void devide(int i ,int j) {
	
	int k = i/ j ;
	
	System.out.println(k);
}
}
