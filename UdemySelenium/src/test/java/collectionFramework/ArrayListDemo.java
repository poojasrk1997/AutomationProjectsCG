package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//data is ordered
		//Arraylist, LinkedList and Vector - implements List Interface
		//duplicate value is allowed
		//we can access and insert any value at any index
		//Arraylist can grow dynamically and array ha fixed size	
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Pooja");
		al.add("Saurav");
		al.add("Rimpa");
		//al.add("Saurav");
		al.add(0, "Amita");
		
		System.out.println(al.contains("Danny"));
		System.out.println(al.indexOf("Saurav"));
		System.out.println(al.get(2));
		//System.out.println(al);
		
		Iterator<String> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
