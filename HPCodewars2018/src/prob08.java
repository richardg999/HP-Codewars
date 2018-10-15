import java.util.*;
import java.io.*;

public class prob08 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob08.txt"));

		while (true)
		{
			int a = in.nextInt(), b = in.nextInt();
			
			if (a == 0 && b == 0) break;
			
			String line = "";
			int i = a;
			for (i = a; line.length() < b; i++)
			{
				line += i;
			}
			
			if (Integer.toString(a).length() > b) i = 0;
			else if (line.length() > b) i -= 2;
			else i -= 1;
			System.out.println(a + " " + b + " " + i);
		}

		in.close();
	}
}