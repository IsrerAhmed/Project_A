package exercise_page_16_Methods;

public class Employee {
	int SSN;//instance variable
	String Name;//instance variable

	public static void main(String[] args) {
		
		
		Employee em= new Employee(12345,"Donald Trump");
		Employee em1= new Employee(2345,"Alam Hossain");
		Employee em2= new Employee(3456,"Gulam Kabir");
		
	}
	
	public  Employee(int ssn,String nm) {
		SSN=ssn;
		Name=nm;
		
		System.out.println("Employee SSN="+SSN);
		System.out.println("Employee Name="+Name);
	}

} 
