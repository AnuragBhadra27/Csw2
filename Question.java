class A{
	public A() {
		System.out.println("A class Constructor");
	}
	void Display() {
		System.out.println("Hello A");
	}
}
class B extends A{
	public B() {
		System.out .println("B class Constructor");
	}
	void show() {
		super.Display();
		System.out.println("Hello B");
	}
}

public class Question {

	public static void main(String[] args) {
		B obj1= new B();
		obj1.show();

	}

}
