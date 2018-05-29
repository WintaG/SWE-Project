package lesson3;

public class Main {
	public static void main(String[] args) {
		
		
		Address b1= new Address("asmara", "bedho", "eritrea", "345");
		Address b2= new Address("Chicago", "bedho", "eritrea", "345");
		Address b3= new Address("chi", "bedho", "eritrea", "345");
		
		Customer c1= new Customer("winta","assefaw","1233");
		c1.setBillingAddress(b1);
		c1.setShippingAddress(b3);
		Customer c2= new Customer("sam","ef","1533");
		c2.setBillingAddress(b2);
		c2.setShippingAddress(b2);
		Customer c3= new Customer("wi","faw","133");
		c3.setBillingAddress(b1);
		c3.setShippingAddress(b3);
		
        Customer customers[]= {c1,c2,c3};
       for(Customer cu: customers) {
    	   	if(cu.getBillingAddress().getCity().equalsIgnoreCase("Chicago"))
    	   		System.out.println(cu);
       }
	}
	

}
