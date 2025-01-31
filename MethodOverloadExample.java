/*Case 1*/
class Test{
	void Show(int a, float b) {
		System.out.println("1");
	}
	void Show(int c) {
		System.out.println("2");
	}
}
/*Case 2*/
class Test2{
	void Show(long a, long b) {
		System.out.println("a");
	}
	void Show(int c , int d) {
		System.out.println("b");
	}
	
	
/*Case 3*/
}class Test3{
	void Show(int a, float b) {
		System.out.println("c");
	}
	void Show(float d,int c) {
		System.out.println("d");
	}
}


public class MethodOverloadExample {

	public static void main(String[] args) {
		Test t = new Test();
		t.Show(20,20);
		
		Test2 t1 = new Test2();
		t1.Show(20, 20);
		
		Test3 t2 = new Test3();
		t2.Show(20, 20);

	}

}
