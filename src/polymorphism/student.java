package polymorphism;

public class student extends person{
	//it does have a method1
	public void method1() {
		//first it prints student 1
		System.out.println("Student 1");
		//then calls it's parent class method 1 in person class
		super.method1();
		//now needs to run method2 but we need to check the original class object that called here
		//original object has a method2 as well so it needs to run that method2 go back to undergrad class
		method2();
	}
	
	public void method2() {
		
		System.out.println("Student 2");
	}
}
