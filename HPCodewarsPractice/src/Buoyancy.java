import java.util.*;
import java.io.*;

public class Buoyancy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("Buoyancy.dat"));

		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) {
			in.nextLine();
			System.out.println((int)Math.ceil(0.54/(0.011*in.nextInt())));
		}

		in.close();
	}
}