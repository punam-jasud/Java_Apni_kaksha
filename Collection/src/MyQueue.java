
public class MyQueue {

	Node head , rear;
	
	public void enQueue(int data)
	{
		Node toAdd = new Node(data);
		if(head == null)
		{
			head = rear = toAdd;
			return;
		}
		rear.next = toAdd;
		rear = rear.next;
		
		
	}
	
	public int deQueue()
	{
		Node temp;
	
		if(head == null )
		{
			return -1;
		}
		
		temp = head;
		head = head.next;
		
		if(head == null)
		{
			
			rear = null;
		}
		return temp.data;
		
	}

	
	public void display() throws Exception
	{
		if(head == null)
		{
			throw new Exception("Queue Empty");
		}
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	
	
	public static class Node
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
		
		MyQueue q  = new MyQueue();
		
		q.enQueue(100);
		q.display();
		
		

	}

}
