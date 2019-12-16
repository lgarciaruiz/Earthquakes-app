package polymorphism;

public class person {
	//method1 in this parent class exists
	public void method1() {
		
		
		//prints person 1 and goes back to method that called this method which is student
		System.out.println("Person 1");
	}
	public void method2() {
		
		System.out.println("Person 2");
	}
}
