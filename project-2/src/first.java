import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class first {
	public static void main(String args[]) {
		initialize();
		print();
	}

	public static int generateRand(int min, int max) {
		int rand = min + (int) (Math.random() * max);
		return rand;
	}

	// Student Array
	public static String studentNames[] = new String[5];

	// Student IDs
	public static int studentId[] = new int[5];

	// Student Emails
	public static String studentEmail[] = new String[5];

	public static void initialize() {

		System.out.println("Enter 5 student names, enter delimits each different name");
		for (int i = 0; i < 5; i++) {

			Scanner scan = new Scanner(System.in);
			String next = scan.nextLine();

			studentNames[i] = next;
			studentId[i] = generateRand(111111, 999999);

			String nameSplit[] = next.split(" ", 2);
			studentEmail[i] = nameSplit[0] + "." + nameSplit[1] + "@stjlabs.com";

		}

	}

	public static void readFile(String fileName) {
		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line = null;
			
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}
	}


	public static void print() {
		for (int i = 0; i < 5; i++) {
			System.out.println(studentNames[i] + "\t\t\t\t" + studentId[i] + "\t\t\t\t" + studentEmail[i]);

		}
	}
}
