import java.util.*;
import java.io.*;

public class prob08 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob08-1-in.txt"));

		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) {
			String word = in.next();
			
			for (int i = 0; i < word.length() - 1; i++)
			{
				String line = "";
				for (int k = word.length() - 1; k > i; k--)
					line += " ";
				for (int k = 0; k <= i; k++)
					line += word.charAt(k);
				System.out.println(line);
			}
			System.out.println(word);
			for (int i = 1; i <= word.length() - 1; i++)
			{
				System.out.println(word.substring(i));
			}
			System.out.println();
			
		}

		in.close();
	}

}