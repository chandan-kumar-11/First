package mypackage;

public class Anonymous {
	int a,b;
	{
		System.out.println("welcome chandan kumar in india");
	}
	
	public Anonymous() {
		a=4;
		b=5;
		System.out.println("default constructor");
	}
	


	public Anonymous(int x, int y) {
		super();
		a = x;
		b = y;
		System.out.println("two parameterized constructor");
	}
	public void display() {
		System.out.println(a);
	    System.out.println(b);
	
	}




	public static void main(String[] args) {
		Anonymous x1=new Anonymous();
		x1.display();
		Anonymous x2=new Anonymous(6,7);
        x2.display();
	}

}
