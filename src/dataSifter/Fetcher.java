package dataSifter;
import java.io.*;
import java.util.*;

public class Fetcher {
	public void fetch(String csv) {
		Scanner sc;
		try {
			sc = new Scanner(new File(csv));
		sc.useDelimiter("");   
		while (sc.hasNext())
		{  
			System.out.print(sc.next());  
		}   
		sc.close();  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}	
		
}
