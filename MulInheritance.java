package ObjectOrientedProgramme;
interface A{
	void show();
}
interface B{
	void show();
}
class C implements A,B{
	public void show() {
		System.out.print("ABC");
	}
	
}
public class MulInheritance {

	public static void main(String[] args) {
		C obj1=new C();
		obj1.show();
		

	}

}
