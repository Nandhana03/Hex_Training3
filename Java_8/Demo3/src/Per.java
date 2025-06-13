//
//public class Per extends Employee{
//   
//double bonus;
//	
//	public Per(String name, double salary) {
//		super(name, salary);
//	}
//
//	void calBon()
//
//	{
//
//	    bonus=getSalary()*10/100;
//	 
//	}
//
//	@Override
//	public String toString() {
//		return "Per:"+(bonus+getSalary());
//	}
//}

public class Per extends Employee {

    double bonus;

    public Per(String name, double salary) {
        super(name, salary);
    }

    void calBon() {
        bonus = getSalary() * 10 / 100;
    }

    @Override
    public String toString() {
        return "Per Total Salary: " + (bonus + getSalary());
    }
}
