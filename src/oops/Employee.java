package oops;

public class Employee {

	public String name;
	public int empid;
	public String department;	

public Employee() {
	
	System.out.println("default");
}
public Employee(String n1, int n2, String n3) {
	
name=n1;
empid=n2;
department=n3;
}

public void display() {
	System.out.println(name);
	System.out.println(empid);
	System.out.println(department);
}
}

