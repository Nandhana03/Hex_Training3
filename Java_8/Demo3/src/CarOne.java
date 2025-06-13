
public class CarOne {
     
	public CarOne(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	 String name;
	 String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "CarOne [name=" + name + ", type=" + type + "]";
	}
	
	public void accelerate()
	{
		System.out.println("accelerating at 3 kmph...");
	}
	
}
