//
//public abstract class Employee {
//   
//	public Employee(String name, double salary) {
//		super();
//		this.name = name;
//		this.salary = salary;
//	}
//
//
//
//
//	private String name; 
//	private double  salary;
//
//	 
//
//		 
//	abstract void calBon();
//
//
//
//
//	public String getName() {
//		return name;
//	}
//
//
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//
//
//	public double getSalary() {
//		return salary;
//	}
//
//
//
//
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//}



public abstract class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        super();
        this.name = name;
        this.salary = salary;
    }

    abstract void calBon();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

