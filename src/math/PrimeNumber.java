package math;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int number=getRandomNumber(20000000,  10000000);
		//System.out.println(number);
		System.out.println(primeNumber(number));

	}
	public static List<Integer> primeNumber(int number) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i <= number; i++) {
			for (int j = 2; j <= i; j++) {
				if (i == j) {
					list.add(i);
					//System.out.println(i);
				} else if (i % j == 0) {
					break;
				}
			}
		}
		return list;
	}

	public static int getRandomNumber(int max, int min){
		int randomNumber=0;
		Random rand = new Random();
		randomNumber = rand.nextInt(max) +1;
		return randomNumber;
	}

}
