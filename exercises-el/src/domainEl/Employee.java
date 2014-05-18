package domainEl;

public class Employee {
	private Name name;
	private Addess address;
	
	public Employee(Name name, Addess address) {
		this.name = name;
		this.address = address;
	}
	
	public Name getName() {
		return name;
	}
	
	public Addess getAddress() {
		return address;
	}
}
