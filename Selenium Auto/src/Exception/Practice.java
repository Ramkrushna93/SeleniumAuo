package Exception;

public class Practice {

	public void divison() throws ArithmeticException {

		int a = 10;
		int b = 0;

		if (b == 0) {
			ArithmeticException ae = new ArithmeticException("please dont provide 0 as denominator");
			throw ae;
		} else {
			int c = a / b;
			System.out.println("The result of the two number" + c);
		}

	}

	public static void main(String[] args) {

		Practice p = new Practice();
		p.divison();
	}

}
