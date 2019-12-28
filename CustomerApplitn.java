package project1;

public class CustomerApplitn
{

	public static void main(String[] args)
	{
		Customer customer = new Customer();
		customer.setCustomerId(121);
		customer.setCustomerName("priyanka");
		customer.setCity("hyderabad");
		System.out.println(customer.getCustomerId());
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getCity());
	}

}
