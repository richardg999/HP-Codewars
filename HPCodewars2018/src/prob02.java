import java.util.*;
import java.io.*;

public class prob02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob02.txt"));

		while (true)
		{
			double v = in.nextDouble(), a = in.nextDouble(), t = in.nextDouble();
			if (v== 0 && t == 0 && a == t) break;
			
			System.out.println(v * t + 0.5 * a * Math.pow(t, 2));
		}

		in.close();
	}
}