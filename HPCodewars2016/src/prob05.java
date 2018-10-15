import java.util.*;
import java.io.*;

public class prob05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob05-1-in.txt"));

		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) {
			int num = in.nextInt();
			String line = in.nextLine().trim();
			String result = "";
			
			for (int i = 0; i < line.length(); i++)
			{
				if (i % num == 0) continue;
				result += line.charAt(i);
			}
			System.out.println(result + " " + result.length());
		}

		in.close();
	}

}