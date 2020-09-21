package exercise_page_27_Array_String;

public class Exercise1 {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		System.out.println("Original Array");
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		System.out.println("Array In Reverse Order");
		
		for(int i= a.length-1; i>=0;i--) {
			System.out.println(a[i]);
		}
	}
	
}
