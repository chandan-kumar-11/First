package mypackage;

public class This2 {
	int a,b;
	public This2() {
		this(4,5);
		
		System.out.println("default parameter");
	}
	public This2(int x) {
		
		this(6,x);
		System.out.println("one parameterize constructor");
	}
	public This2(int x,int y) {
		a=x;
		b=y;
		System.out.println("two parameterize constructor");
	
	}
	public void display() {
		System.out.println(a);
		System.out.println(b);
	
	}
	
 
	public static void main(String[] args) {
		This2 x1=new This2();
		x1.display();
		This2 x2=new This2(8);
		x2.display();
		This2 x3=new This2(7,9);
		x3.display();
			
		
	}

}
