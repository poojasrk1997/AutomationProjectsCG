package OOPSConceptAbstraction;

public class ChildTest extends Shape {
	
	ChildTest()
	{
		System.out.println("Child test class constructor");
	}

	public static void main(String[] args) {
		
		/*Shape s=new ChildTest();
		s.drawingSquare();
		s.fillingCircle();*/
		
		ChildTest t=new ChildTest();
		
	}

	@Override
	void drawingSquare() {
    System.out.println("ChildTest - drawingSquare");
	}

}
