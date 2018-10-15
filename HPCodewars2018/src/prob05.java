import java.util.*;
import java.io.*;

public class prob05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob05.txt"));

		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) {
			String start = in.next();
			int date = in.nextInt();
			
			int[][] calendar = new int[6][20];
			calendar[0][getstart(start)] = 1;
			
			int enddate = 20 - getstart(start) / 2;
			
			
		}

		in.close();
	}
	
	static int getstart(String day)
	{
		switch(day)
		{
		case "Monday": return 4;
		case "Tuesday": return 7;
		case "Wednesday": return 10;
		case "Thursday": return 13;
		case "Friday": return 16;
		case "Saturday": return 19;
		case "Sunday": return 1;
		default: return 0;
		}
	}
}