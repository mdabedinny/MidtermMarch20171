package math;

import java.util.ArrayList;
import java.util.List;
public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

         for (int x=100; x>=0; x--){
         	if(x<100 && x>=90){
         		x=x;
			}else if(x<90 && x>=70){
         		x-=1;
			}else if(x<70 && x>=40){
				x-=2;
			}else if(x<40 && x>=0){
				x-=3;

			}
			 System.out.print(x+",");

		 }

		

		

	}
}
