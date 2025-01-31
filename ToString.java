package ObjectOrientedProgramme;
class Student{
	int id ;
	String name;
	Student(String name , int id){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return " name: "+name+ " id: " +id;
	}
}
public class ToString {

	public static void main(String[] args) {
		Student Anurag = new Student ("Anurag",2153);
		System.out.println(Anurag);

	}

}
