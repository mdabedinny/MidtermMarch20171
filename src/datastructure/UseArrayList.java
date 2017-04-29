package datastructure;
import databases.ConnectDB;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<=10; i++){
        	list.add(i);
		}
		System.out.println(list.get(5));
		list.remove(1);
		System.out.println(list);

		for(Integer aList:list){
			System.out.print(aList+" ");
		}
		System.out.println();
		Iterator it = list.iterator();
		while (it.hasNext()){
			System.out.print(it.next()+" ");
		}
		ConnectDB connectDB = new ConnectDB();
		//connectDB.InsertDataFromArrayListToMySql(Integer.parseInt(list.get()));



	}

}
