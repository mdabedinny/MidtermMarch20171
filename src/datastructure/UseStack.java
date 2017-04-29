package datastructure;
import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;
public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		// creating stack
		Stack<String> st = new Stack();

		// populating stack
		st.push("Java");
		st.push("Source");
		st.push("code");

		for(String str:st){
			System.out.print(str+" ");
		}

		// checking elements
		System.out.println("Elements in the stack: "+st);
		// checking the top object
		System.out.println("Top object is: "+st.peek());
		// searching 'code' element
		System.out.println("Searching 'code' in stack: "+st.search("code"));
		// removing top object
		System.out.println("Removed object is: "+st.pop());

		// elements after remove
		System.out.println("Elements after remove: "+st);
		Iterator str1=st.iterator();
		while (str1.hasNext()){
			System.out.println(str1.next());
		}

	}
}


