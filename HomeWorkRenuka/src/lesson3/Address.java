package lesson3;

public class Address {
	String city;
	String street;
	String state;
	String zip;
	
//	public Address() {
//		city= null;
//		street= null;
//		state= null;
//		zip= null;			
//	}
	public Address(String city, String street, String state, String zip) {
		this.city= city;
		this.street= street;
		this.state= state;
		this.zip= zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
}
