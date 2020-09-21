package exercise_page_27_Array_String;

public class Exercise7 {

	public static void main(String[] args) {
		int []x;
		x=new int [10];
		
		x[0]=10;
		x[1]=21;
		x[2]=303;
		x[3]=50;
		x[4]=34;
		x[5]=409;
		x[6]=20;
		x[7]=11;
		x[8]=33;
		x[9]=100;
		
		int largest= x[0];
		int len=x.length;
		
for(int i=1; i<len;i=i+1) {
			if(largest<x[i]) {
				largest=x[i];
			}
			
		}
System.out.println(largest);
	
	}

}
