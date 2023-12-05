package oppo;

public class SmartPhone {
	//attributes
	String model= "a71";
	public int batteryPercentage = 32;
	protected int cameraCount;
	private String password;
	
	// methods
	public void makeCall() {
		System.out.println("Calling");
	}
		public void makeText() {
			System.out.println("Texting");	
	}
	public static void main(String[] args) {
		System.out.println("In main method");
	}
}
