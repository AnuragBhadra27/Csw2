package ObjectOrientedProgramme;

import java.util.Objects;

class Student3{
	private int id;
	private String name;
	private int age;
	
	public Student3(int id , String name ,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(age);
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null) {
			return false;
		}
		Student3 st=(Student3)obj;
		return this.age==st.age;
	}
}
public class hash_code {

	public static void main(String[] args) {
		Student3 s1=new Student3(18,"Abc",20);
		Student3 s2=new Student3(10,"Abc",20);
		Student3 s3=new Student3(10,"Abc",120);
		Student3 s4=new Student3(68,"Abc",59);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s1));

	
	}

}
