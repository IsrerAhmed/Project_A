package day4;

public class Method_Object_Add {

	public static void main(String[] args) {
		
		Method_Object_Add d = new Method_Object_Add();
		
				int z ;
		
		z =d.add(5000, 7777);
		System.out.println(z);
		
	z=d.add(65432, 23453);
	
	System.out.println(z);
		
		
	}
	// there is no static and void that why we  call it object level method.
public int add(int a, int b) {
		
		int c = a + b ;
		return c; 
		
		}
}
