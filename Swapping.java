package mypackage;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=5;
		System.out.println("Before swapping");
		System.out.println("value of a"+a);
		System.out.println("value of b"+b);
		a=(a+b)-(b=a);
		System.out.println("after swapping");
		System.out.println("value of a"+a);
        System.out.println("value of b"+b);
	}

}
