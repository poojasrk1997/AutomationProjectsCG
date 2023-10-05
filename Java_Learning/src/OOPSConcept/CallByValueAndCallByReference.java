package OOPSConcept;

public class CallByValueAndCallByReference {

	int p;
	int q;

	public static void main(String[] args) {

		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x = 30;
		int y = 40;
		obj.sum(x, y);// Call by value or pass by value which
		// creates a duplicate copy this variable and assign these values to parameter
		System.out.println(x);
		System.out.println(y);

		obj.p = 80;
		obj.q = 90;

		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);

	}

	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public void swap(CallByValueAndCallByReference t) {
		int temp = t.p; // temp = 80
		t.p = t.q; // t.p = 90
		t.q = temp; // t.q=80

	}

}
