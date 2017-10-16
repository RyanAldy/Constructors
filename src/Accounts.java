
public class Accounts {


	public void Tax() {

		System.out.println("Tax Rate: " + 15);
	}

	public float Tax(int salary) {

		int T;

		T = salary * 15/100;
		System.out.println(T);
		return T;


	}


	public float Tax(int S, float T) {

		float Tax;

		Tax = S * T/100;
		System.out.println(Tax);
		return Tax;
		


	}
}

