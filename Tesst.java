class test{
	int a;
	int b;
	test(int a , int b){
		this.a=a;
		this.b=b;
	}
	void Display() {
		System.out.println(a);
		System.out.println(b);
	}
}
class test1 extends test{
	private int c;

	test1(int a,int b){
		super(a,b);
		
	}
}
public class Tesst {

	public static void main(String[] args) {
		test1 obj = new test1(20,30);
		obj.Display();
	}

}
