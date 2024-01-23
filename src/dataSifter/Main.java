package dataSifter;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
	
public static void main(String args[]) throws FileNotFoundException {
	Scanner input = new Scanner(System.in);
	System.out.println("What file do you want read?");
	String csvName = input.next();
	
	Fetcher t = new Fetcher();
	t.fetch(csvName);
	input.close();
}
}

