package reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		//String textFile ="/Users/mdislam/Desktop/Textfile.rtf";

		try{

			//Create object of FileReader
			FileReader inputFile = new FileReader(textFile);

			//Instantiate the BufferedReader Class
			BufferedReader bufferReader = new BufferedReader(inputFile);

			//Variable to hold the one line data
			String line;

			// Read file line by line and print on the console
			while ((line = bufferReader.readLine()) != null)   {
				System.out.println("File Line is: " + line);
			}
			//Close the buffer reader
			bufferReader.close();
		}catch(Exception e){
			System.out.println("Error in reading file:" + e.getMessage());
		}


	}

}
