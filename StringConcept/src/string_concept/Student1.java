package string_concept;

public class Student1 {
	int id;
	String name;
	String city;
	public Student1(int id, String name, String city) {

		this.id=id;
		this.name=name;
		this.city=city;
		// TODO Auto-generated constructor stub
	}
/*public String toString()
{
	return id+"  "+name+"  "+city;
}*/
	void displayInfo()
	{
		System.out.println(id+"  "+name+"  "+city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s1=new Student1(436,"neelu","hyd");
		Student1 s2=new Student1(001,"ramya","hyd");
		System.out.println(s1);
		System.out.println(s2);
		s1.displayInfo();
		s2.displayInfo();
	}}
		
			
	