package Exception;

public class Div {

	public static void main(String[] args) {
		try {

			String s1 = args[0];
			String s2 = args[1];

			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);

			int c = a / b;
			System.out.println("The div value of c=" + c);
		} catch (ArithmeticException e) {
			System.out.println("Don't enter zero for denominator");
		} catch (NumberFormatException u) {
			System.out.println("Don't enter special symbol");
			// }
//		catch(ArrayIndexOutOfBoundsException ab)
//		{
//			System.out.println("Please enter two values");
		} catch (Exception o) {
			System.out.println("Please enter two value");
		} finally {
			System.out.println("I am from finally block");
		}

	}

}
