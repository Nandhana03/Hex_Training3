package bills;

@FunctionalInterface
public interface CalculateBill {
     
	public double calbill(double amount);
	
	default public double diwaliDiscount(double amount)
	{
		return amount-(amount*0.05);
	}
}
