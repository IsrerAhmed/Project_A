package exercise_page_23_Loop;

public class Exercise4_odd {

	public static void main(String[] args) {
int  sum=0;

		for(int x=11; x<=100; x=x+1) {
			
			
			
			sum = sum + x;
		}
		if(sum%2!=0) {
  System.out.println("ODD="+sum);
	

		}
		else {
			System.out.println("even="+sum);
		}
	}

}
