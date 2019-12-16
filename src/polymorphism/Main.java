package polymorphism;

public class Main {	


public static void main (String[] args) {
	
	//reference here is person object type is undergrad
	
	person u = new undergrad();
	//undergrad does not have method1 so it calls parent class and checks for method1
	//parent class in undergrad is student
	u.method1();
}

}
