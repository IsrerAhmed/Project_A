package exercise_page_27_Array_String;

import java.util.Arrays;

public class Exercise7_main {

	public static void main(String[] args) {
		int a[]= {10,21,303,50,34,409,20,11,33,100};
		int size=a.length;
		Arrays.parallelSort(a);
		System.out.println(a[size-1]);
	}

}
