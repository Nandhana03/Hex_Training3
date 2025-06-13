//
//public class Temp extends Employee{
//    
//	double bonus;
//	
//	public Temp(String name, double salary) {
//		super(name, salary);
//	}
//
//	void calBon()
//
//	{
//
//	    bonus=getSalary()*5/100;
//	 
//	}
//
//	@Override
//	public String toString() {
//		return "Temp:"+(bonus+getSalary());
//	}
//	 
//}


public class Temp extends Employee {

    double bonus;

    public Temp(String name, double salary) {
        super(name, salary);
    }

    void calBon() {
        bonus = getSalary() * 5 / 100;
    }

    @Override
    public String toString() {
        return "Temp Total Salary: " + (bonus + getSalary());
    }
}
