import java.util.Stack;


public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s);

		int popped = s.pop();
		System.out.println(popped);
		
		System.out.println(s.peek());
	}

}
