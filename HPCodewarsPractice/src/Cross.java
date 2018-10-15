import java.util.*;
import java.io.*;

public class Cross {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("cross.dat"));

		int N = in.nextInt(); in.nextLine();
		for (int idx = 0; idx < N; idx++) {
			String line = in.nextLine(), one = line.substring(0, line.indexOf(" and")), two = line.substring(line.indexOf(" and") + 5);
			
			int o = -1, t = -1;
			for (int i = 0; i < one.length(); i++)
			{
				int index = two.indexOf(one.charAt(i));
				if (index < 0) continue;
				else {o = i; t = index; break;}
			}
			
			if (o < 0 && t < 0) {System.out.println("none\n"); continue;}
			char[][] map = new char[two.length()][one.length()];
			map[t] = one.toCharArray();
			
			for (int r = 0; r < two.length(); r++)
				map[r][o] = two.charAt(r);
			
			for (char[] a: map)
			{
				for (char x: a)
				{
					if (x > 123 || x < 97) System.out.print(" ");
					else System.out.print(x);
				}
				System.out.println();
			}
			System.out.println();
		}

		in.close();
	}
}