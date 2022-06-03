package mypackage;

public class This3 {
	int a,b;
	public This3(int x,int y) {
		a=x;
		b=y;
	}
	
	public This3 swap() {
		a=(a+b)-(b=a);
		return this;
	}
	public This3 display()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		return this;
		
	}

	public static void main(String[] args) {
		new This3(4,5).display().swap().display();

	}

}
