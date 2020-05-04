
import java.util.ArrayList;
import java.util.List;


public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList();
		ArrayList<String> vegetables = new ArrayList();
		
		fruits.add("Apple");
		fruits.add("Orange");
		
		
		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.add("Peanut");
		
		fruits.addAll(vegetables);
		
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
		
		vegetables.clear();
		System.out.println(vegetables);
		System.out.println(fruits);
		
		System.out.println(fruits.size());
		
		System.out.println(fruits.contains("Tomato"));
		System.out.println(fruits.contains("Guvava"));
		
		System.out.println(fruits.isEmpty());
		System.out.println(vegetables.isEmpty());
		
		String array[] = new String[fruits.size()];
		fruits.toArray(array);
		
		for(String e : array)
		{
			System.out.println(e);
		}

	}

}
