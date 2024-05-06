package Week3.Day1;

public class Amazon extends CanaraBank {

	public void cardPayments() {
		System.out.println("Card payments");
		
	}

	public void internetBanking() {
		System.out.println("Internet Banking");
		
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("Record Payment Details");
	}

	public static void main(String[] args) {
		
		Amazon exec = new Amazon();
		
		exec.cahonDelivery();
		exec.cardPayments();
		exec.internetBanking();
		exec.recordPaymentDetails();
		exec.upiPayments();
		
	}

}
