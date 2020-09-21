package exercise_page_27_Array_String;

public class Exercise2 {

	public static void main(String[] args) {
		int [] num ={20,40,60,80};
		
		int sum =0;
		
		for (int i=0; i < num.length;i++) {
			sum = sum + num[i];
			}
		
		int avg =sum/ num.length;
		
		System.out.println("Average Value:"+avg);

	}

}
