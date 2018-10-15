import java.util.*;
import java.io.*;

public class Between {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("between.dat"));

		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) {
			in.nextLine();
			String word = in.next();
			System.out.println(word);
			while(word.length() > 3)
			{
				word = word.substring(1, word.length()-1);
				System.out.println(word);
			}
			System.out.println();
		}
		
		in.close();
	}
}
