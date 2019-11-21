
public class TestB {
	static int b;
	int a;
	{
		a = 10;
		b = 20;
		System.out.println("non static block 1");
	}
	public static void main(String[] args) {
		
		System.out.println("main started");
		TestB b = new TestB();
		TestB b1 = new TestB();
		System.out.println("a value "+b.a);
		System.out.println("b value "+ b.b);
		System.out.println("main method");
	}
	
	{
		a = 20;
		b = 30;
		System.out.println("non static block 2");
	}
}
