package mypackage;

public class ThisDemo1 {
	int a,b;
	

	public ThisDemo1(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
	public void display() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		ThisDemo1 x1=new ThisDemo1(4,5);
		x1.display();
		

	}

}
