package lesson3;

public class Customer {
	
	String firstName;
	String lastName;
	String socSecurityNUm;
	Address shippingAddress;
	Address billingAddress;
	
	
//	public Customer() {
//		firstName= null;
//		lastName= null;
//		socSecurityNUm= null;
//	}
	
	public Customer(String firstName, String lastName, String socSecurityNum) {
		this.firstName= firstName;
		this.lastName= lastName;
		this.socSecurityNUm= socSecurityNum;
	}
	
	
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocSecurityNUm() {
		return socSecurityNUm;
	}
	public void setSocSecurityNUm(String socSecurityNUm) {
		this.socSecurityNUm = socSecurityNUm;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billinAddress) {
		this.billingAddress = billinAddress;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", socSecurityNUm=" + socSecurityNUm
				+ "]";
	}

	
	
	
	

}
