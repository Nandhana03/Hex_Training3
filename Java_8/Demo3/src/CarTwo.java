
public class CarTwo extends CarOne{
    
	int carnumber;
	public CarTwo(String name, String type) {
		super(name, type);
		this.carnumber=carnumber;
	}
     
	@Override
	public void accelerate()

	{
		System.out.println("Accelerating...");
	}
}
