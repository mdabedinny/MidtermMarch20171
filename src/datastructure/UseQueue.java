package datastructure;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Iterator;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue=new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");
		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek());
		System.out.println("iterating the queue elements:");
		for(String str:queue){
			System.out.println(str);
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}

	}

}
