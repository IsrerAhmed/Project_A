package exercise_page_23_Loop;

public class Exercise4_even {

	public static void main(String[] args) {
		int  sum=0;
		
		for(int x=11; x<=100; x=x+1) {
			
			if(x%2==0)
			
			sum = sum + x;
		}
  System.out.println("sum="+sum);
	}

}
