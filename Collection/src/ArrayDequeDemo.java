
public class ArrayDequeDemo {

	
	Node head,tail;
	

	public void addToHead(int data)
	{
		Node toAdd = new Node(data);
		
		if(head == null)
		{
			head = tail = null;
			return;
		}
		head.next = toAdd;
		toAdd.prev = head;
		head = toAdd;
		
	}
	public int removeFromTail()
	{
		if(head == null)
		{
			return -1;
		}
		Node toRemove = tail;
		tail = tail.next;
		tail.prev = null;
		
		
		if(tail == null)
		{
			head = null;
		}
		return toRemove.data;
	}
	
	
	
	
	public static class Node
	{
		int data;
		Node next;
		Node prev;
		
		public Node(int data)
		{
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
