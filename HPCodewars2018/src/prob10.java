import java.util.*;
import java.io.*;

public class prob10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob10.txt"));
		
		int N = in.nextInt();
		for (int i = 0; i < N; i++) {
			int T = in.nextInt();
			int base = (int) Math.sqrt(T);
			int H = in.nextInt();
			int n = (int) Math.sqrt(T) + H - 1;
			int sides = 2 * (n - base + 1) * (n + base);
			int top = n * n;
			int ans = sides + top;
			System.out.println(ans + " liters");
		}

		in.close();
	}
}