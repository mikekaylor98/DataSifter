package dataSifter;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

	public static void main(String args[]) throws FileNotFoundException {

		Fetcher t = new Fetcher();
		String csvName;
		int lineNum;

		Scanner input = new Scanner(System.in);
		System.out.println("File(1) or Line(2)?");
		String option = input.next();

		switch(option) {

		case "1": 
			System.out.println("Enter file name");
			csvName = input.next();
			t.fetch(csvName);
			break;

		case "2":
			System.out.println("Enter file name");
			csvName = input.next();
			System.out.println("Enter line number");
			lineNum = input.nextInt();
			t.fetchLine(csvName, lineNum);
			break;

		default:
			System.out.println("Invalid choice");

		}

		input.close();
	}
}

