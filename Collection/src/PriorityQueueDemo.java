import java.util.PriorityQueue;


public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(1);
		pq.add(78);
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		
	}

}
