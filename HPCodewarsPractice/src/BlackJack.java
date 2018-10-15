import java.util.*;
import java.io.*;

public class BlackJack {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("blackjack.dat"));

		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) 
		{
			int total = 0;
			in.nextLine();
			
			while (true)
			{
				if (total > 21)
				{
					System.out.println("bust");
					break;
				}
				if (total > 16)
				{
					System.out.println(total);
					break;
				}
				String next = in.next();
				if (next.equals("K") ||next.equals("J") ||next.equals("Q"))
					total += 10;
				else if (next.equals("A"))
				{
					if (total > 10)
						total += 1;
					else
						total += 11;
				}
				else
					total += Integer.parseInt(next);
			}
		}

		in.close();
	}
}
