package algorithm;
import java.util.List;
import java.util.Random;
import algorithm.Sort;
import databases.ConnectDB;

/*
 *Created by PIIT_NYA on 04/22/2017.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[10000];
		
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			
		num[i] = rand.nextInt(1000000);
			
		}
		ConnectDB connectDB = new ConnectDB();
		//Selection Sort
		Sort algo = new Sort();
//		algo.selectionSort(num);
//		long selectionSortExecutionTime = algo.executionTime;
//		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
//         connectDB.InsertDataFromArrayListToMySql(num, "selection_sort", "SortingNumbers");
//		List<String> numbers = connectDB.readDataBase("selection_sort", "SortingNumbers");
//		for (String st:numbers){
//			System.out.println(st);
//		}
		//Insertion Sort
//		algo.insertionSort(num);
//		long insertionSortExecutionTime = algo.executionTime;
//		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//Continue for rest of the Sorting Algorithm....
		//Bubble sort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + bubbleSortExecutionTime + " milli sec");

		// shell Sort
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + shellSortExecutionTime + " milli sec");


	}

}
