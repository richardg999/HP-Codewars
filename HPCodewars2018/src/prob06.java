import java.util.*;
import java.io.*;

public class prob06 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob06.txt"));

		int N = in.nextInt();
		in.nextLine();
		for (int idx = 0; idx < N; idx++) {
			String l = in.nextLine();
			char[] a = l.toCharArray();
			int num = 0;
			boolean ok = true;
			char four = 'a';
			for (char x: a) 
			{
				//System.out.println(x + " " + num);
				if (!(x > 46 && x < 58)) continue;
				if (num == 0 && (x == '0' || x == '1')) {ok = false; break;}
				if (num == 1 && (x == '9')) {ok = false; break;}
				if (num == 3 && (x == '0' || x == '1')) {ok = false; break;}
				if (num == 4) {four = x;}
				if (num == 5 && (four == '1' && x == '1')) {ok = false; break;}
								num++;
			}
			
			if (ok) System.out.println(l + " VALID");
			else System.out.println(l + " INVALID");
			
		}

		in.close();
	}
}