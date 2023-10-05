package Functions;

public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println("String args[]");

		MethodOverloading md = new MethodOverloading();
//		md.test();

//		int s = md.sum();
//		System.out.println(s);

//		int d = md.div(20, 5);
//		System.out.println(d);

		double b1 = md.test(10.11, 11.00);
		System.out.println(b1);

		int i1 = md.test(12);
		System.out.println(i1);

		int m1 = md.test(15, 6);
		System.out.println(m1);
		
		double p1=md.test(3, 4.1);
		System.out.println(p1);
	}
	
	public static void main(String args)
	{
		System.out.println("String args");
	}

	// no input no output
	public void test() {
		System.out.println("test method");
	}

	// Method Overloading - multiple method with same but different parameters
	public int test(int i) {
		System.out.println("int test one param method");
		return i;

	}

	public int test(int a, int b) {
		System.out.println("int test two param method");
		return a + b;

	}

	public double test(double a, double b) {
		System.out.println("double test two param method");
		return a + b;

	}
	
	public double test(int p, double q) {
		System.out.println("double int test two param method");
		return p + q;

	}

	// no input some output
	public int sum() {
		System.out.println("sum method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	// some input some output
	public int div(int x, int y) {
		System.out.println("div method");
		int z = x / y;
		return z;
	}

}
