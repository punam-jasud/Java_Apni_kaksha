import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s  = new TreeSet<>();
		
		s.add("Kiwi");
		s.add("Apple");
		s.add("Banana");
		s.add("Carrot");
	
		
		System.out.println(s);
		System.out.println(s.add("Mango"));
		System.out.println(s.add("Apple"));

		
		Set<String> s1  = new TreeSet<>();
		
		s1.add("Kiwi");
		s1.add("Punam");
		s1.add("Banana");
		s1.add("Jasud");
		
		s.addAll(s1);
		System.out.println(s);
		
		s.retainAll(s1);
		System.out.println(s);
		System.out.println(s.containsAll(s1));

	}

}
