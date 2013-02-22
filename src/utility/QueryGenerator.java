package utility;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class QueryGenerator {
	public static String filename = "query/query.in.100";
	public static void main(String[] args){
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(filename));
			Random rand = new Random();
			int times = 100;
			while(times -- > 0){
				int x = rand.nextInt((int)FormatData2Norm.scale), y = rand.nextInt((int)1 * FormatData2Norm.scale - x);
				System.out.println(x + " " + y);
				pw.println(x + " " + y);
			}
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
