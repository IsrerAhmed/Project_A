package day6;

public class Ex7 {

	public static void main(String[] args) {

		//1
		calculatePremieum(24,1); //650
		//
		calculatePremieum(24,7); //no insurance. 0
		calculatePremieum(50,1); //550
		
		
	}
		public static void calculatePremieum(int age, int noAcc) {
		int basic=500; 
		//s/w
		int total=0;
		if(age<25) {
			
			///this is the part for below 25 age
			if(noAcc==1) {total = basic + 50 +100;}
			else if(noAcc==2){total = basic + 120 +100;}
			else if(noAcc==3){total = basic + 220 +100;}
			else if(noAcc==4){total = basic + 370 +100;}
			else if(noAcc==5){total = basic + 570 +100;}	
			else {System.out.println("no insurance");}
			
			}
			
		else {
			
			//this is the part for above 25 age.
			
			if(noAcc==1) {total = basic + 50 ;}
			else if(noAcc==2){total = basic + 120 ;}
			else if(noAcc==3){total = basic + 220 ;}
			else if(noAcc==4){total = basic + 370 ;}
			else if(noAcc==5){total = basic + 570 ;}	
			else {System.out.println("no insurance");}	
			
		}	
		
		
		System.out.println(total); //620
		
	}

}
