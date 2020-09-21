package exercise_page_23_Loop;

public class Exercise4_while_loop {

	public static void main(String[] args) {
		
		int sum=0;
		
		int x=11;
		while(x<=100) {
			
			if(x%2!=0) {
				
				sum=sum+x;}
			
			System.out.println("Sum="+sum);
			x=x+1;	
		}
		
		
	
	}
}

