import java.util.*;
public class MyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<String> fruits = new LinkedList<>();
		//List<String> Vegetables = new LinkedList<>();
		JavaLinkedList fruits = new JavaLinkedList();
		JavaLinkedList Vegetables = new JavaLinkedList();
		
		fruits.add("Apple");
		fruits.add("Orange");
		
		
		Vegetables.add("Potato");
		Vegetables.add("Tomato");
		Vegetables.add("Peanut");

		fruits.print();
		Vegetables.print();
	/*	fruits.addAll(Vegetables);
		
		System.out.println(fruits);
		System.out.println(fruits.get(2));
		fruits.set(4,"Carrot");
		System.out.println(fruits);
		fruits.remove(1);
		System.out.println(fruits);
		
		List<String> toRemove = new ArrayList();
		toRemove.add("Apple");
		toRemove.add("Potato");
		
		fruits.removeAll(toRemove);
		System.out.println(fruits);
		
		Vegetables.clear();
		System.out.println(Vegetables);
		System.out.println(fruits);
		
		System.out.println(fruits.size());
		
		System.out.println(fruits.contains("Tomato"));
		System.out.println(fruits.contains("Guvava"));
		
		System.out.println(fruits.isEmpty());
		System.out.println(Vegetables.isEmpty());
		
		String array[] = new String[fruits.size()];
		fruits.toArray(array);
		
		for(String e : array)
		{
			System.out.println(e);
		}

*/

	}

}
