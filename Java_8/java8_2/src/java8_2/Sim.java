package java8_2;

@FunctionalInterface

public interface Sim {
      
	public void calling();
	
	public default void message()
	{
		System.out.println("Messaging...");
	}
}
