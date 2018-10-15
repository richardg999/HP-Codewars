import java.util.*;
import java.io.*;

public class prob07 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob07-2-in.txt"));

		while (in.hasNextDouble()) {
			
			double period = in.nextDouble();
			if (period == 0) break;
			double square = period * period;
			double axis = Math.pow(square, (double) 1 / 3);
			System.out.println(axis);
		}

		in.close();
	}

}