package pack;

public class Student {
	
	int age=30, rollno=1100;
	
	public void display1()
	{
		System.out.println("Automation is very easy");
	}
	
	public void display2()
	{
		System.out.println("Welcome to all of you");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println("Age is =" +s.age);
		System.out.println("Roll no is =" +s.rollno);
		s.display1();
		s.display2();
		
		
	}

}
