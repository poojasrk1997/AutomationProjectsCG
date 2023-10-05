package OOPSConceptAbstraction;

public abstract class Shape {
	
	Shape()
	{
		System.out.println("Shape Class Constructor");
	}
	
	int color;
	
	abstract void drawingSquare();
	
	public void fillingCircle()
	{
		System.out.println("Shape -- filling circle");
	}
	
	//Hiding implementation details and Actual business logic is defined in child class with overriden method
	//In abstract class we can have both the things abstract method and normal method
	//cannot create object of abstract class and Interface bcoz both are abstract in nature
	//we have all abstract methods in abstraction that's why we can achieve 100% abstraction
	//In abstraction partial abstract method will be there so we cannot achieve abstraction
	//Partial abstraction - abstraction
	//Full abstraction - Interfaces
	//Cannot create constructor is interface
	//whenever constructor of abstract class is created it will be called when we create object of child class

}
