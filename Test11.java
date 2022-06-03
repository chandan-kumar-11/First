package mypackage;

public class Test11 {
	static int b;
	int a;

	public static void main(String[] args) {
		int c=3;
		System.out.println("local variable ="+c);
		System.out.println("static member ="+Test11.b);
		Test11 x1=new Test11();
		System.out.println("instance variable"+x1.a);

	}

}
