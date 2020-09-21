package exercise_page_27_Array_String;

public class Practice_work {

	public static void main(String[] args) {
		
		int []x;
		x=new int [6];
		
		x[0]=10;
		x[1]=15;
		x[2]=20;
		x[3]=30;
		x[4]=40;
		x[5]=50;
		
		
		int len=x.length;
		
		for(int i=0; i<len;i=i+1) {
			
			System.out.println(x[i]);
		}
		
	}

}
