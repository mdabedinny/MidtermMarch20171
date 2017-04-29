package datastructure;
import java.util.LinkedList;
import java.util.Iterator;
public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList<String> al=new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		System.out.println(al.get(0));
		al.remove(2);
		System.out.println(al);
		for(String str:al){
			System.out.println(al);
		}

		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
