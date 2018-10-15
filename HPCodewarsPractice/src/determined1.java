import java.util.*;
import java.io.*;

public class determined1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("determined1.dat"));

		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			int det = a * d - b * c;
			System.out.println(det);
		}

		in.close();
	}
}