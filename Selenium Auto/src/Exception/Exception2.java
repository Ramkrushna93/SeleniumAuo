package Exception;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter ur mark");

		String mark = s.nextLine();
		try {
			int im = Integer.parseInt(mark);
			System.out.println("ur mark=" + im);
		} catch (java.lang.NumberFormatException c) {
			System.out.println("Don't enter string/special marks");
			// c.printStackTrace();
		}

	}

}
