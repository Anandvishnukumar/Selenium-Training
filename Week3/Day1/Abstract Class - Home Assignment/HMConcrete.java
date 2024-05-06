package Week3.Day1;

public class HMConcrete implements HADatabseConnection {

	public void connect() {
System.out.println("Connect");		
	}

	public void disconnect() {
		System.out.println("DisConnect");		
		
	}

	public void executeUpdate() {
		System.out.println("Execute Update");		
		
	}
	
	public void delete(){
		System.out.println("Delete");		

		
	}
	
	
	public static void main(String[] args) {
		HMConcrete exe = new HMConcrete();
		
		exe.connect();
		exe.delete();
		exe.disconnect();
		exe.executeUpdate();
		
	}

}
