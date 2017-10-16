
public class StartMethodOverload {

	public static void main(String[] args) {
		Accounts ONS = new Accounts();
		
		// To use Tax procedure
		ONS.Tax();
		
		// To use 2nd function
		ONS.Tax(25000);
		
		// To use 3rd function
		ONS.Tax(25000, 15);
		
		

	}

}
