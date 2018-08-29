public class Arithmetic {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		float x = 5.5f;
		float y = 20.2f;
		
		System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

		System.out.println("a + b = " + (a + b));
		System.out.println("a + x = " + (a + x));
		System.out.println("a + y = " + (a + y));
		System.out.println("b + x = " + (b + x));
		System.out.println("b + y = " + (b + y));
		System.out.println("x + y = " + (x + y));

		System.out.println("a / b = " + (a / b));
        System.out.println("x / y = " + (x / y));
        System.out.println("b / a = " + (b / a));
        System.out.println("y / x = " + (y / x));
	}
}