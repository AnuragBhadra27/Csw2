class Company{
	private String name;
	private String loc;
	
	Company(String name, String loc){
		this.name= name;
		this.loc=loc;
	}
	String getName() {
		return name;
	}
	String getloc() {
		return loc;
	}
}
class Employee{
	private int id;
	private String name;
	private Company c;
	Employee(int id, String name,Company c){
		this.id=id;
		this.name=name;
		this.c=c;
	}
	void display(){
		System.out.println(name);
		System.out.println(id);
		System.out.println(c.getName());
		System.out.println(c.getloc());
	}
}
public class Compsny {

	public static void main(String[] args) {
	Company obj1 = new Company("ACCENTURE","BLR");
	Employee obj2= new Employee(2711427,"ANURAG",obj1);
	obj2.display();
	
	}

}
