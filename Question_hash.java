package ObjectOrientedProgramme;

import java.util.Objects;

class Book{
	int Bid;
	String Bname;
	int Bprice;
	
	Book(int Bid, String Bname , int Bprice){
		this.Bid=Bid;
		this.Bname=Bname;
		this.Bprice=Bprice;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(Bprice,Bname);
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null) {
			return false;
		}
		Book st=(Book)obj;
		return this.Bname==st.Bname;	}
}
public class Question_hash {

	public static void main(String[] args) {
		Book b1=new Book(124,"EvaTordos",2999);
		Book b2=new Book(156,"corman",2999);
		Book b3=new Book(194,"EvaTordos",2987);
		Book b4=new Book(129,"EvaTordos",2999);
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		System.out.println(b4.hashCode());
		
		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b3));
		System.out.println(b3.equals(b4));
		System.out.println(b1.equals(b4));




	}

}

/*Design A java Program for university student enrollment,ensuring loose coupling and high cohesion.Create Student  and Course classes,
and an enrollment class that interracts
 * with through an enrollmentSystem interface.
 * Implement methods for enrolling and dropping student from course,and displaying enrollment details.
 * In the mainenrollmentApp class,demonstrate functionality by managing student enrollment.
 * use comments to explain how the design maintains loose coupling (by relaying on interface) and high cohesion(by keeping related functionalities
 * within appropriate class)*/
