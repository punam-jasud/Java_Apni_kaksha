
public class JavaLinkedList {
	
	Node head = null;
	void add(String data)
	{
		Node toAdd = new Node(data);
		
		if(head == null)
		{
			head = toAdd;
			return;
		}
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = toAdd;
		
	}
	void print()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	static class Node
	{
		String data;
		Node next;
		
		public Node(String data)
		{
			this.data = data;
			next = null;
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	}

}
