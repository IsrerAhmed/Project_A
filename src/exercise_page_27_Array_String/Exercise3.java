package exercise_page_27_Array_String;

public class Exercise3 {

	public static void main(String[] args) {
		int [] x= {1,2,3,4,5,6,2,3,4,6};
		
		for (int i = 0; i < x.length;i++) {
			
			for (int j =i+1; j< x.length;j++) {
				
				if ((x[i])==(x[j]) && (i!=j)) {
					
					x[j]=0;
					
					//System.out.println("Duplicate Element :"+x[j]);break;
				}
				
			}
		}
		for(int l=0;l<x.length;l++) {
			System.out.println(x[l]);
		}

	}

}
