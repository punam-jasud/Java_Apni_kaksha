import java.util.LinkedList;
import java.util.Queue;


public class QueueDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		MyQueue q  = new MyQueue();
		
		/*q.add(10);
		q.add(20);
		q.add(30);
		
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);

		System.out.println(q.element());*/
		
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		
		q.display();
		
		System.out.println(q.deQueue());
		q.display();
		
	}

}
