package mypackage;

public class Const1 {
	int a,b;

	public Const1() {
		a=4;
		b=5;
		System.out.println("default constructor");
		
	}

	public Const1(int x, int y) {
		super();
		a = x;
		b = y;
		System.out.println("two parameterize constructot");
	} 
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Const1 x1=new Const1();
		x1.display();
		Const1 x2=new Const1(6,8);
		
		x2.display();

	}

}
