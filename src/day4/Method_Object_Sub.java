package day4;

public class Method_Object_Sub {

	public static void main(String[] args) {
		
		Method_Object_Sub d = new Method_Object_Sub ();
		
		int x;
		x =d.sub(50000, 30000);
		
		System.out.println(x);
		
		x =d.sub(9000, 10000);
		
		System.out.println(x);
	}

	
	public int sub (int a, int b)
	
	{	int c = a - b ;
	
		
		return c;
		
	}
	
	
}
