package domainEl;

public class Addess {
	private String street;
	private String city;
	private String ZipCode;
	
	public Addess(String street, String city, String zipCode) {
		this.street = street;
		this.city = city;
		ZipCode = zipCode;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getZipCode() {
		return ZipCode;
	}
}
