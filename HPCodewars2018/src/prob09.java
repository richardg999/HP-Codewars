import java.util.*;
import java.io.*;

public class prob09 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob09.txt"));

		while (true)
		{
			int x = in.nextInt();
			if (x == 0) break;
			
			String bin = Integer.toBinaryString(x);
			int one = bin.length() - bin.replace("1","").length();
			int zero = bin.length() - bin.replace("0", "").length();
			
			if (one == zero) System.out.println(x + " BALANCED");
			else if (one > zero) System.out.println(x + " HEAVY");
			else System.out.println(x + " LIGHT");
		}

		in.close();
	}
}