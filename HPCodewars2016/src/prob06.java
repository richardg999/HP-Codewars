import java.util.*;
import java.io.*;

public class prob06 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob06-1-in.txt"));

		int N = in.nextInt();
		
		for (int idx = 0; idx < N; idx++) {
			int t = in.nextInt();
			int t0 = in.nextInt();
			int t1 = in.nextInt();
			int c0 = in.nextInt();
			int c1 = in.nextInt();
			double slope = (double) (c1 - c0) / (t1 - t0);
			double yIntercept = c0 - slope * t0;
			double ans = (slope * t + yIntercept) / 8;
			System.out.println(ans);
		}

		in.close();
	}

}