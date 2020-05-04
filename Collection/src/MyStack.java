
public class MyStack {
	
	Node head = null;
	
	void push(int data)
	{
		Node temp = new Node(data);
		
		if(head == null)
		{
			head = temp;
		}
		else
		{
			temp.next = head;
			head = temp;
		}
	}
	void display() throws Exception
	{
		Node temp;
		if(head == null)
		{
			throw new Exception("stack empty!!");
		}
		else
		{
			temp = head;
			while(temp != null)
			{
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}
	
	int pop() throws Exception
	{
		if(head == null)
		{
			throw new Exception("Empty stack");
		}
		else
		{
			Node temp = head;
			head = head.next;
			temp.next = null;
			return temp.data;
			
		}
		
	}
	
	int peek() throws Exception
	{
		if(head == null)
		{
			throw new Exception("Empty stack");
			
		}
		else
		{
			return head.data;
		}
	}
	
	
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			next = null;
		}
		
		
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyStack s = new MyStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		s.display();
		System.out.println("Popped : "+ (s.pop()));
		System.out.println("Popped : "+ (s.pop()));
		System.out.println("Popped : "+ (s.pop()));
		System.out.println("Popped : "+ (s.pop()));
	
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println("Peek : " + s.peek());

	}

}
