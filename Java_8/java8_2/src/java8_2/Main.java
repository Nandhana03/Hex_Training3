package java8_2;

public class Main {
   public static void main(String args[])
   {
	   Sim s1=new Vodafone();
		s1.calling();
		s1.message();
		
		Sim s2=new Airtel();
	    s2.calling();
	    s2.message();
   }
	
}
