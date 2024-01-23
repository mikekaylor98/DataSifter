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

	public void fetchLine(String csv, int lineNum) {

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(csv));
			List<String> lines = new ArrayList<>();
			String line = null;
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}

			System.out.println(lines.get(lineNum));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
