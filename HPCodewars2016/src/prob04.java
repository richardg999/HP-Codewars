import java.util.*;
import java.io.*;

public class prob04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob04-1-in.txt"));

		while (true)
		{
			double num = in.nextDouble(), pow = in.nextDouble();
			if (num == 0 && pow == 0) break;
			System.out.printf("%.2f\n", num * Math.pow(10, pow));
		}

		in.close();
	}

}