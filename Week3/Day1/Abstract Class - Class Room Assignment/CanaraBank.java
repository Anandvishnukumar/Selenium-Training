package Week3.Day1;

public abstract class CanaraBank implements payment{

	public void cahonDelivery() {
System.out.println("Cash On Delivery");		
	}

	public void upiPayments() {
		System.out.println("UPI Payments");		
		
	}



	public abstract void recordPaymentDetails();
	
	
}
